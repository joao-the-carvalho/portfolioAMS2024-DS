<head>
    <title>Ordem Decrescida</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
    body, html{
    background-image: url(https://i.imgur.com/MkmqHnW.jpeg);
    font-family: "Orbitron", sans-serif;
    background-size:cover;
    overflow-x: hidden;
    overflow-y: hidden;
}
:root{
              --darkgray: #2c3e50;
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
background: linear-gradient(-45deg, #226951, #35b158, #5aa2f5, #91b9e7, #FFFFFF);
border-radius: 10px;
}
.window{
        background: linear-gradient(-45deg, #226951, #35b158, #5aa2f5, #91b9e7, #FFFFFF);
        width: 1199px;
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
echo "<div class='container'><div class='windowdaora'><input type='text' class='window' readonly placeholder='Numeros Ímpares'><button class='close' onclick='history.back()'>X</button></div><div class='borda'>";
$inicio = $_POST["inicio"];
$fim = $_POST["fim"];
echo "Todos os valores ímpares entre ".$inicio." e ".$fim.":<br>";
for ($i = $fim; $i >= $inicio; $i--){
    if($i % 2 != 0){
        echo $i.", ";
    }
}
echo "</div> </div>";
?>