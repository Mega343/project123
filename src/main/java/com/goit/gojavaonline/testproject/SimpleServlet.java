package com.goit.gojavaonline.testproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/CalculateServlet")
public class SimpleServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        String userInputForumala = request.getParameter("formula");
        String result = Main.calculateUserFormula(userInputForumala);
        PrintWriter out = response.getWriter();
        out.println (
               "<page language=\"java\" contentType=\"text/html; charset=utf-8\" pageEncoding=\"utf-8\">\n" +


        "<html>"+
        "<head>"+
        "<title>Онлайн калькулятор</title>"+
        "</head>"+
        "<body BGCOLOR=\"#ffffcc\">"+
           "<center>"+
            "<p>"+
            "<b>Онлайн калькулятор</b>:"+
            "<p>"+
            "<fieldset style=\"border:1px #00BFFF solid;\">"+
            "<b>Формула</b> :"+userInputForumala+
            "<b>Результат</b> :" + result +
        "</center>"+
        "</fieldset>"+
        "</body>"+
        "</html>"
        );
    }


    /*
       generate the page showing all the request parameters
     */
//    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setStatus(200);
//
//        request.getRequestDispatcher("result.jsp").forward(request, response);
//    }

}