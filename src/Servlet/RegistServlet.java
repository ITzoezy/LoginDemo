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

@WebServlet("/registServlet")
public class RegistServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1、获取请求的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        2、检查 用户名是否可用
            if (userService.existsUsername(username)) {
                req.setAttribute("msg","用户名已存在");
//              System.out.println("用户名[" + username + "]已存在!");

                //        跳回注册页面
                req.getRequestDispatcher("/regist.jsp").forward(req, resp);
            } else {
                //      可用
//                调用service保存到数据库
                userService.registUser(new User(null, username, password));
//
//        跳到注册成功页面 regist_success.jsp
                req.getRequestDispatcher("/regist_success.jsp").forward(req, resp);
            }

    }
}
