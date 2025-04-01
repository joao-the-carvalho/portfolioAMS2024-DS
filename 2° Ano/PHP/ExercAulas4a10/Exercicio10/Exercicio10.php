<head>
    <title>Par ou Impar? Eis a Resposta!</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
     <style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
    body, html{
    background-image: url(https://i.imgur.com/AxJJGhr.jpeg);
    font-family: "Orbitron", sans-serif;
    background-size:cover;
    overflow-x: hidden;
    overflow-y: hidden;
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
    border: 2px solid #90bcdc;
padding: 40px;
text-align: center;
background: linear-gradient(45deg, #375272, #5aa2f5);
border-radius: 10px;
}
.window{
        background: linear-gradient(45deg, #375272, #5aa2f5);
        width: 210px;
        color: black;
        font-weight: bold;
    }
    .close{
        width: 80px;
        height: 27px;
        background: linear-gradient(45deg, red, darkred);
        border: 0;
        border-radius: 5px;
    }
    .windowdaora{
        display: flex;
        align-items: center;
        background-color: grey;
    }
    </style>
</body>
</html>
<?php
$num = $_POST["num"];
echo "<div class='container'><div class='windowdaora'><input type='text' class='window' readonly placeholder='Maior e Menor'><button class='close' onclick='history.back()'>X</button></div><div class='borda'>";
if ($num % 2 == 0) {
    echo "Este número é par! <br>";
    if ($num % 3 == 0) {
        echo "E também é divisível por 3!";
    }
}
else {
    echo "Este número (".$num. ") é impar!";
}
echo "</div> </div>";
?>