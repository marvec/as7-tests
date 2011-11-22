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

public class Helper { 

   protected String read() throws IOException {
      InputStream is = Helper.class.getResourceAsStream("/my_resource.txt");
      BufferedReader in = new BufferedReader(new InputStreamReader(is));
      String output = "";
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        output += inputLine + "\n";
      }
      in.close();
      is.close();
      return output;
   }
}