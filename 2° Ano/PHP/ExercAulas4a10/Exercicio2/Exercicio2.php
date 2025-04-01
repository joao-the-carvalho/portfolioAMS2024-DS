<!DOCTYPE html>
<html lang="en">
<head>
    <title>Desconto Calculado</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
                body, html{
            background-image: url(https://i.imgur.com/Gqv7aKu.jpeg);
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
span{
    color:#9ced7b;
}
.borda{
            border: 2px solid #64a4d9;
        padding: 40px;
        text-align: center;
        background: linear-gradient(45deg, #4e6a8e, #5a9df5);
        border-radius: 10px;
        opacity: 0.85;
        }
    </style>
    <div class="container">
<?php
$preco = $_POST["preco"];
$desconto = $_POST["desconto"];
$precof = ($preco * $desconto)/100;
echo "<div class='borda'> O preço original era de: R$"."<div class='precoorig'>".$preco."</div>."."<br>";
echo "O desconto era de: ".$desconto."%."."<br>";
echo "Logo, o preço final ficou em:."."<span>"."R$".$precof."."."</span> </div>";
?>    
</div>
</body>
</html>
