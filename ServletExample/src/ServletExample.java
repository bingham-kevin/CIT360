import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name= "testing", urlPatterns= {"/test"})
public class ServletExample extends HttpServlet{
	String email;
	ArrayList<String> emailList = new ArrayList<String>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		email = request.getParameter("email");
		addToList();
		response.sendRedirect("http://localhost:8080/ServletExample/");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        out.println("<h1>Email List</h1>");
        for(String i :emailList){
        	out.println(i);
        	out.println("<br>");
        	}
        out.println("</body></html>");
	}
	
	protected void addToList() {
			emailList.add(email);
		}
}