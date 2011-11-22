package org.jboss.test.as7.resources;

import java.io.IOException;
import java.io.PrintWriter; 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

public class ResourcesServlet extends HttpServlet { 

   @Override
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
   }  
   
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Helper h = new Helper();
      PrintWriter out = response.getWriter();
      out.println(h.read());
      out.close();
   }
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
   
}