package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class contactserv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name=request.getParameter("t1");
		long mobileno=Long.parseLong(request.getParameter("m1"));
		String Query=request.getParameter("q1");
		PrintWriter out=response.getWriter();
		if(test.contact(name,mobileno,Query))
		{ //out.println("<html><body>< h1 style='position:relative; top:50px;left:100px;'>");
		out.println("QUERY HAS BEEN SUBMITTED");
		//out.println("</h1></style></body></html>");
		System.out.println("QUERY HAS BEEN SUBMITED");
 RequestDispatcher rd= request.getRequestDispatcher("index.html");
		
		rd.include(request, response);}
		else
		{
			out.println("QUERY NOT SUBMITTED PROPERLY");
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}
	}

}
