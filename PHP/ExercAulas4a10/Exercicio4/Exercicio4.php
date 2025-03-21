<head>
    <title>Variáveis Trocadas</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
                       @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
        body, html{
            background-image: url(https://i.imgur.com/JnDo5Ox.jpeg);
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
            border: 2px solid #64a4d9;
        padding: 40px;
        text-align: center;
        background: linear-gradient(45deg,rgb(71, 87, 113), #5a9df5, #a9c7ef);
        border-radius: 10px;
        opacity: 0.85;
        }
    </style>
</body>
</html>
<?php
$v1 = $_POST["v1"];
$v2 = $_POST["v2"];
$temp = 0;
echo "<div class='container'> <div class='borda'>";
echo "Valores antes da troca: ".$v1." (Valor 1), ".$v2." (Valor 2)."."<br>";
$temp = $v1;
$v1 = $v2;
$v2 = $temp;
echo "Valores após a troca: ".$v1." (Valor 1, antes valor 2), ".$v2." (Valor 2, antes valor 1).";
echo "</div> </div>";
?>