package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class serv4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	HttpSession session=request.getSession(false);
	//int  voterid=(int)session.getAttribute("voterid");
	session.removeAttribute("voterid");
	//String name= (String) session.getAttribute("name");
	PrintWriter out=response.getWriter();
	//out.println(name+"     "  +voterid);
    out.println("<html><body><style position:relative; top:200px>");
    out.println("		LOGOUT OUT SUCCESSSFULLY ");
    out.println("</style></body></html>");
	RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
	
	}

}
