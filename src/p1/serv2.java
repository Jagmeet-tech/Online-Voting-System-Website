package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;


public class serv2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    // String name=request.getParameter("name");
     int voterid=Integer.parseInt(request.getParameter("voterid"));
    // HttpSession session=request.getSession();
    //int voterid1=(int)session.getAttribute("voterid");
    
       if(test.checkvoterid(voterid))
      {
     	 System.out.println("YOU ALREADY VOTED PLEASE GIVE CHANCE TO OTHERS");
         	
    	 response.sendRedirect("index.jsp");
      }
     //String state=request.getParameter("state");
      else if(test.vali1(voterid))
     {   // RequestDispatcher rd=request.getRequestDispatcher("main.html");
          //rd.forward(request, response);
    	  System.out.println("welcome ji for voting");
    	response.sendRedirect("main.jsp");
   }
     else{
    	 response.sendRedirect("index.jsp");
     }
	

//	if(test.delete(name, voterid, state))
	}
}
