<head>
    <title>Média Calculada</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
    body, html{
    background-image: url(https://i.imgur.com/bohevMP.jpeg);
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
    border: 2px solid #64aed9;
padding: 40px;
text-align: center;
background: linear-gradient(45deg, #373c72, #5ab2f5);
border-radius: 10px;
color:whitesmoke;
font-size: 25px;
}
    </style>
</body>
</html>
<?php
$n1 = $_POST["n1"];
$n2 = $_POST["n2"];
$n3 = $_POST["n3"];
$n4 = $_POST["n4"];
$media = ($n1 + $n2 + $n3 + $n4)/4;
echo "<div class='container'><div class='borda'>";
echo $media."<br>";
if ($media >= 6) {
    echo "Parabéns, você foi aprovado(a)!";
} else if ($media >= 3 && $media < 6) {
    echo "Você irá para o exame de recuperação para decidir sua nota final.";
} else {
    echo "Você foi reprovado(a), estude mais ano que vem.";
}
echo "</div> </div>";
?>