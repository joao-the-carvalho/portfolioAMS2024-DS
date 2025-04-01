<head>
    <title>Quadrados somados</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
body, html{
    background-image: url(https://i.imgur.com/rcqLb5x.jpeg);
    font-family: "Orbitron", sans-serif;
    background-size: cover;
    overflow-x: hidden;
    overflow-y: hidden;
    color:whitesmoke;
}
.container {
height: 100vh;
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
text-align: center; 
margin: 0;
padding: 0;
}
.borda{
    border: 2px solid #6cd964;
padding: 40px;
text-align: center;
background: linear-gradient(45deg, #387237, #62f55a);
border-radius: 10px;
}
button{
    border-radius: 10px;
    border: none;
    width: 150px;
    height: 50px;
    background: linear-gradient(45deg, #245925, #74f55a);
    box-shadow: #000000 1px 1px 3px;
    color: aliceblue;
    text-decoration:double;
}
    </style>
</body>
</html>
<?php
$n1 = pow($_POST["v1"], 2);
$n2 = pow($_POST["v2"], 2);
$n3 = pow($_POST["v3"], 2);
echo "<div class='container'><div class='borda'>'";
echo "Quadrado do primeiro número: ".$n1.". <br>";
echo "Quadrado do segundo número: ".$n2.". <br>";
echo "Quadrado do terceiro número: ".$n3.". <br>";
echo "Soma dos quadrados: ".$n1+$n2+$n3.".";
echo "</div> </div>"
?>