package Servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@WebServlet("/download")
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取要下载的文件名
        String downloadFileName = "pgone.jpg";
        //2、读取要下载的内容文件（通过servletContext对象可以获取）
        ServletContext servletContext = getServletContext();
        //获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/File/" + downloadFileName);
        System.out.println("下载的文件类型: " + mimeType);
        //4.在回传前，通过响应头告诉客户端返回的数据类型
        resp.setContentType(mimeType);
        //5.还要告诉客户端收到的数据是用于下载使用（还是响应头）
        //Content-Disposition响应头，表示收到的数据怎么处理
        //attachment表示附件，表示下载使用
        //filename=表示指定下载的文件名
        resp.setHeader("Content-Disposition","attachment;Filename=" + downloadFileName);

        //获取相应的输出流
        InputStream resourceAsStream = servletContext.getResourceAsStream("/File/" + downloadFileName);
        //读取输出流中的全部数据，复制给输出流。输出给客户端
        OutputStream outputStream = resp.getOutputStream();
        //3.把下载的文件内容回传给客户端
        IOUtils.copy(resourceAsStream,outputStream);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
