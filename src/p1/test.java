package p1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {
    
	 static boolean vali(String name,int voterid,String state)
	{
		boolean flag=false;
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
		     PreparedStatement ps=con.prepareStatement("insert into voter values(? , ?, ?)");
		     ps.setString(1,name);
		     ps.setInt(2, voterid);
		     ps.setString(3, state);
		      int n=ps.executeUpdate();
		     
		     if (n==1)
		     { flag=true;
		     
		    	 
		     }
		     System.out.println(n+"ROW INSERTED!!");
		     con.close();
		     }catch(Exception e)
		 {
		    e.printStackTrace();
		    	 
		 } 
		 return flag;
			}

	 static boolean vali1(int voterid)
		{
			boolean flag=false;
			try{
				 Class.forName("oracle.jdbc.driver.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			    Statement ps1= con.createStatement();
			    ResultSet rs_pointer_to_table=ps1.executeQuery("select voterid from voter");
			   while(rs_pointer_to_table.next())
			   { //System.out.println("hello");
				  
			  if(rs_pointer_to_table.getInt(1)==voterid)
				  {  System.out.println(rs_pointer_to_table.getInt(1));
				  flag=true;
				  break;}
			  else 
			  { flag=false;}
			   }
			      
			     con.close();
			    }catch(Exception e)
			 {
			    e.printStackTrace();
			    	 
			 } 
			 return flag;
				}

	 static boolean vali(int voterid,String name,String votingparty)
		{
			boolean flag=false;
			try{
				 Class.forName("oracle.jdbc.driver.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			     PreparedStatement ps=con.prepareStatement("insert into votedlist values(? , ?,?)");
			     ps.setInt(1, voterid);
			     ps.setString(2,name);
			     ps.setString(3, votingparty);
			      int n=ps.executeUpdate();
			     
			     if (n==1)
			     { flag=true;
			     
			    	 
			     }
			     System.out.println(n+"ROW INSERTED!!");
			     con.close();
			     }catch(Exception e)
			 {
			    e.printStackTrace();
			    	 
			 } 
			 return flag;
				}

 static boolean delete()
		{
			boolean flag=false;
			try{
				 Class.forName("oracle.jdbc.driver.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			     PreparedStatement ps=con.prepareStatement("delete voter");
			     //ps.setString(1,name);
			     //ps.setInt(2, voterid);
			     //ps.setString(3, state);
			      int n=ps.executeUpdate();
			     
			     if (n==1)
			     { flag=true;
			     
			    	 
			     }
			     System.out.println(n+"ROW INSERTED!!");
			     con.close();
			     }catch(Exception e)
			 {
			    e.printStackTrace();
			    	 
			 } 
			 return flag;
				}

 static boolean contact(String name,long mobile_no,String Query)
	{
		boolean flag=false;
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
		     PreparedStatement ps=con.prepareStatement("insert into contact values(? , ?, ?)");
		     ps.setString(1,name);
		     ps.setLong(2, mobile_no);
		     ps.setString(3, Query);
		      int n=ps.executeUpdate();
		     
		     if (n==1)
		     { flag=true;
		     
		    	 
		     }
		     System.out.println(n+"ROW INSERTED!!");
		     con.close();
		     }catch(Exception e)
		 {
		    e.printStackTrace();
		    	 
		 } 
		 return flag;
			}
		
  public static ResultSet result()
	{
	     ResultSet rs=null;
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
		     Statement ps=con.createStatement();
		     rs = ps.executeQuery("select votingparty from votedlist");
		     //con.close();
		     if(rs==null) rs.close();
		     if(con==null) con.close();
		}catch(Exception e)
				{
					System.out.println(e);
				}
		
		return rs;
			}
		

	 static boolean checkvoterid(int voterid)
		{
			boolean flag=false;
			try{
				 Class.forName("oracle.jdbc.driver.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
			    Statement ps1= con.createStatement();
			    ResultSet rs_pointer_to_table=ps1.executeQuery("select voterid from votedlist");
			   while(rs_pointer_to_table.next())
			   { //System.out.println("hello");
				  
			  if(rs_pointer_to_table.getInt(1)==voterid)
				  {  System.out.println(rs_pointer_to_table.getInt(1));
				  flag=true;
				  break;}
			  else 
			  { flag=false;}
			   }
			      
			     con.close();
			    }catch(Exception e)
			 {
			    e.printStackTrace();
			    	 
			 } 
			 return flag;
				}

}

