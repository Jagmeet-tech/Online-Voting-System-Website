package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class serv3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession(false);
	int voterid=(int)session.getAttribute("voterid");	
	System.out.println(voterid);
		    
	String name=request.getParameter("t1");
	String party=request.getParameter("t2");
	System.out.println(name + "" +party);
	//HttpSession session=request.getSession();
	//session.setAttribute("name", name);
   // session.setAttribute("party", party);
	
if(test.vali(voterid,name, party))
	{
     // RequestDispatcher rd=request.getRequestDispatcher("logout.jsp");
      //rd.forward(request, response);
    response.sendRedirect("logout.jsp");	
	}
	else{
		response.sendRedirect("main.jsp");
	}
	}
}

