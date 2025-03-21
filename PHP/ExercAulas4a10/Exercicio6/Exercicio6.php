<head>
    <title>Document</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
    body, html{
    background-image: url(https://i.imgur.com/nYqTogx.jpeg);
    font-family: "Orbitron", sans-serif;
    background-size: cover;
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
    border: 2px solid #6cd964;
padding: 40px;
text-align: center;
background: linear-gradient(45deg, #387237, #62f55a);
border-radius: 10px;
}
    </style>
</body>
</html>
<?php
$bruto = $_POST["sal"];
$bonif = ($bruto*10)/100+$bruto;
$imposruim = $bonif-($bonif*20)/100;
echo "<div class='container'> <div class='borda'>";
echo "Seu salário bruto é: R$".$bruto."<br>";
echo "Seu salário mais bonificação é: R$".$bonif."<br>";
echo "E após a aplicação de 20% do imposto de renda, seu salário total fica em: R$".$imposruim."<br>";
echo "</div> </div>";
?>