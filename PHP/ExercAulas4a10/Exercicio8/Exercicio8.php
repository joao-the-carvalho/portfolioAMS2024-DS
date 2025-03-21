<head>
    <title>Document</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
    body, html{
    background-image: url(https://i.imgur.com/50K7Nzc.jpeg);
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
    border: 2px solid #74d964;
padding: 40px;
text-align: center;
background: linear-gradient(45deg, #397237, #64f55a);
border-radius: 10px;
}
.window{
        background: linear-gradient(45deg, #5af55d, #285924);
        width: 330px;
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
$n1 = $_POST["n1"];
$n2 = $_POST["n2"];
$n3 = $_POST["n3"];
$maior = 0;
$menor = 0;
if ($n1 >= $n2 && $n1 >= $n3) {
    $maior = $n1;
} else if ($n2 >= $n1 && $n2 >= $n3) {
    $maior = $n2;
} else {
    $maior = $n3;
}
if ($n1 <= $n2 && $n1 <= $n3) {
    $menor = $n1;
} else if ($n2 <= $n1 && $n2 <= $n3) {
    $menor = $n2;
} else {
    $menor = $n3;
}
echo "<div class='container'><div class='windowdaora'><input type='text' class='window' readonly placeholder='Maior e Menor'><button class='close' onclick='history.back()'>X</button></div><div class='borda'>";
echo "<h2>Resultado:</h2>";
echo "Números digitados: ".$n1.", ".$n2." e ".$n3."<br>";
echo "Maior número: ".$maior."<br>";
echo "Menor número: ".$menor."<br>";
?>