package Servlet;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 调用 userService.login()登录处理业务
        User loginUser = userService.login(new User(null, username, password));
       //管理员登录
        if("admin".equalsIgnoreCase(username)){
            List<User> all = userService.findAll();
            req.setAttribute("user",all);
            req.getRequestDispatcher("/admin.jsp").forward(req, resp);

        }else if (loginUser == null) {
            // 如果等于null,说明登录 失败
//            System.out.println("用户名或密码错误");
            req.setAttribute("msg","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            // 登录 成功
            //跳到成功页面userPage.jsp
            req.getRequestDispatcher("/userPage.jsp").forward(req, resp);
        }
    }
}
