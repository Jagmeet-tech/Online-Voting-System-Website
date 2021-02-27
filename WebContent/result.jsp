<%@page import="javax.print.attribute.standard.MediaSize.Other"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="p1.test"
    import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULT</title>
<link rel="stylesheet" href="make.css">
</head>
<style>
  
    p {
    display: inline;
    position: absolute;
    top: 90px;
    font-size: 23px;
    color: orange;
    text-shadow: green 2px 1px 4px;
    margin: 12px 43px;
    text-decoration: underline;
    font-family: cursive;
}
img{border: 2px;
    border-radius: 16px;
    width:110px;
    height:50px;
}
.bjp {
    top: -13px;
    position: relative;
}
.cong {
    top: -19px;
    left: -4px;
    position: relative;
}
.aam {
    /* position: absolute; */
    top: 173px;
    margin: 124px 47px;
}
.bjp1 {
    position: absolute;
    top: 444px;
    left: 44px;
}
.cong1 {
    position: absolute;
    top: 595px;
    left: 44px;
}
.live {
    position: relative;
    top: 38px;
    text-align: center;
    font-size: 47px;
    font-family: cursive;
    color: orange;
    text-shadow: green 2px 4px 5px;
    /* border-style: solid; */
    /* display: inline; */
    /* border: 7px; */
}
span{
position:initial;
color:red;
font-size:23px;
}
.no{ 
top:1px;
color:black;
}
</style>
<body>
  <h1>VOTING APPLICATION</h1>
    <header class="header">
    <div class="nav">
    
<a href="homeserv" >HOME</a>
 <a href="contact.html">CONTACT US</a>
 <a href="about.html">ABOUT US</a>
      
    </div>
    <h1 class="live">
        LIVE RESULT
    </h1>
    <div class="result">
    <%! ResultSet rs=test.result();
    int aam=0;
    int bjp=0;
    int congress=0;
 %>
 <% while(rs.next())
 {
	 if((rs.getString(1)).trim().equalsIgnoreCase("BJP"))
	bjp++;
	 
	 else if((rs.getString(1)).trim().equalsIgnoreCase("AAM AADMI PARTY"))
	 
		 aam++;
	 
	 else if((rs.getString(1)).trim().equalsIgnoreCase("CONGRESS"))
		 
	congress++;	 
	 
    //else 
	//out.println("NOT VOTE FOR THIS PARTY ")
	
	//out.println(rs.getString(1));
	 
 }
 //out.println("<br> BJP PARTY : "+bjp);
 //out.println("<br> AAM AADMI PARTY : "+aam);
 //out.println("<br> CONGRESS PARTY : "+congress);
 
 %>
     <div class="aam">
     <span class="no">1.</span>    <img src="aam.jpg">
       <p class="aam"> AAM AADMI PARTY  :::<span>""<%= aam %>""</span></p>
     </div>
       <div class="bjp1">
     <span class="no">2.</span>   <img src="bjp.jpg">
        <p class="bjp">BJP PARTY  :::<span>""<%= bjp %>""</span></p> 
       </div>
        <div class="cong1">
      <span class="no">3.</span>      <img src="cong.jpg">
            <p class="cong">CONGRESS PARTY  :::<span>""<%= congress %>""</span></p>
    
    
        </div>     
 


    </div>
 
      
      
 
 
</body>
</html>