package com.grv.servlets;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class FirstServlet extends HttpServlet{
 
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                  throws ServletException, IOException {
           
            PrintWriter out = resp.getWriter();
            out.println("<%@taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>\r\n" 
        			+ "<%@page session=\"true\"%>"
            		+ ""
            		+ "<html>"
            		+ "<head>" 
            		+ "<title>PDF</title>" 
            		+ "</head>");
            out.println("<body>");
            out.println("<jsp:include page='common/menu.jsp' />");
            out.println("hoy es " + new Date());
            out.println("</body>");
            out.println("</html>");
 }
}
