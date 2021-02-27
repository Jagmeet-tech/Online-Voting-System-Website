package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;


public class serv1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
     String name=request.getParameter("name");
     int voterid=Integer.parseInt(request.getParameter("voterid"));
     String state=request.getParameter("state");
     HttpSession session=request.getSession();
     session.setAttribute("voterid", voterid);
     if(test.vali(name,voterid,state))
     { //  RequestDispatcher rd= request.getRequestDispatcher("index.html");
         //rd.forward(request, response);
    	 response.sendRedirect("index.jsp");
   }
     else{
    	 response.sendRedirect("signup.html");
     }
	}

}
