<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="make.css">

</head>
<style>
.log {
    width: 565px;
    height: 100px;
    /* border: 2px solid yellow; */
    position: relative;
    top: 307px;
    left: 40px;
}
h1{
    color: orange;
    text-shadow:4px 4px 5px green;
    
}
.login {
    position: absolute;
    top: 45px;
    left: 216px;
    background-color: bisque;
    height: 30px;
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

    </header>
    <div class="log">
        <h1>YOU SUCCESSFULLY VOTED</h1> 
       <form action="serv4" method="post">
        <input type="submit" class="login" value="LOGOUT">
    </form>


    </div>
    
</body>
</html>