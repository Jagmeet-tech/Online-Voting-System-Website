<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link rel="stylesheet" href="make.css">
<style>
.main {
    position: absolute;
    top: 71px;
    left: 92px;
}
.name {
    margin: 8px;
    padding: 0px;
    height: 23px;
    width: 191px;
}
span {
    position: absolute;
    top: 13px;
    left: 131px;
    font-size: 33px;
}
.container{
    height: 231px;
}
</style>
</head>
<body>
    <h1>VOTING APPLICATION</h1>
    <header class="header">
    <div class="nav">
    
<a href="homeserv" >HOME</a>
 <a href="contact.html">CONTACT US</a>
 <a href="about.html">ABOUT US</a>
      
      
    </div>    

    </header>

    
   </div>
   
 <!--  <%  
   if (session.getAttribute("voterid")==null)
   {
 	  response.sendRedirect("index.html");
   
   } %>-->
    <div class="container">
        <span>VOTE</span>
        <form action="serv3"  class="main" method="post">
        <input type="text" class="name"  placeholder="ENTER YOUR NAME"   name="t1" required><br>
        <select  name="t2" class="name"required>
             <option>CONGRESS</option>
            <option>AAM AADMI PARTY</option>
            <option>BJP</option>
        </select> <br>

        <input type="submit" class="login" value="VOTE">
    
    </form>
</div>
</body>
</html>