<head>
    <title>Document</title>
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
        width: 230px;
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
$valor1 = $_POST["v1"];
$valor2 = $_POST["v2"];
$op = $_POST["tipoconta"];
$resultado = 0;
switch ($op){
    case '+':
        $resultado = $valor1 + $valor2;
        break;
    case '-':
        $resultado = $valor1 - $valor2;
        break;
    case '*':
        $resultado = $valor1 * $valor2;
        break;
    case '/':
        if ($valor2 != 0) {
            $resultado = $valor1 / $valor2;
        } else {
            $resultado = "Como um dos números digitados era zero, a divisão é indefinida.";
        }
        break;
}
echo "<div class='container'><div class='windowdaora'><input type='text' class='window' readonly placeholder='Resultado'><button class='close' onclick='history.back()'>X</button></div><div class='borda'>";
echo "<p> A operação escolhida foi:<br>".$op."<br>Logo, a conta ficou como:<br>".$valor1.$op.$valor2." = ".$resultado."</p>";
?>