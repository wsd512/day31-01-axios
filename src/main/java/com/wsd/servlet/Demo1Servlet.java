package com.wsd.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: wsd165
 * @description $description
 * @author: wansidong
 * @create: 2022-02-19 16:31
 */
@WebServlet("/Demo1Servlet")
public class Demo1Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        PrintWriter out = response.getWriter();

        //设置编码
        request.setCharacterEncoding("utf-8");
        String user = request.getParameter("user");
        System.out.println("user = " + user.length());
        if(user.length()==0){
            out.print("用户名不能为空!");
        }else{
            if("wsd".equalsIgnoreCase(user)){
                out.print("用户名已经存在!");
            }else{
                out.print("可以注册");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
