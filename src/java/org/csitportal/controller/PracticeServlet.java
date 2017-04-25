/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csitportal.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aniisssh
 */
@WebServlet({"/something","/abc"})
public class PracticeServlet extends HttpServlet {

/* Servlet is anythig but  a class that extends 
    HttpServlet(provied class which have capacity to handle HTTP request and HTTP Response)*/
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String url= request.getRequestURI();
       String context = request.getContextPath();
       String ip = request.getRemoteAddr();
       
       /*switch(url)
       {
           case "/3pmweb/something":
               RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
               rd.forward(request,response);
               break;
           case "/3pmweb/abc":
               RequestDispatcher rds = request.getRequestDispatcher("test.jsp");
               rds.forward(request,response);
               break;
           default:
               System.out.println("Sorry url not found");*/
       if(request.getRequestURI().equals(context+"/index")||request.getRequestURI().equals(context+"/"))
       {
           RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
               rd.forward(request,response);
       }
      
       }   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}