<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MONTY</title>
    <link rel="stylesheet" href="make.css">
    <style>
        section {
    position: relative;
    top: 530px;
    left: 481px;
    /* text-align: center; */
    border-style: groove;
    background-color:aquamarine;
    width: 455px;
}
    section a{
      color:blue;
    font-size:30px;
    text-align:centre;
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
    <div class="container">
        <form action="serv2" method="post">
       <span>VOTER LOGIN</span><br>
            <input type="number" class="id" required placeholder="ENTER YOUR VOTER ID NUMBER" name="voterid"><br>
        <input type="submit" class="login" value="LOGIN"><br>
        <a href="signup.html" class="m">NEW VOTER</a>
        </form>
       <!-- <form action="deleteserv" method ="post">
        <input type="reset" class="login" value="REMOVE ALL DETAILS" name="delete" id="del"><br>
        

        </form> -->
    </div>
    <section>
    <a href="result.jsp" > LIVE RESULT OF VOTING</a>
    </section>





</body>
</html>