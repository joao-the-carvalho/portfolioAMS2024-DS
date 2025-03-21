<head>
    <title>Impares Somados</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
                @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
        body, html{
            background-image: url(https://i.imgur.com/50K7Nzc.jpeg);
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
            border: 2px solidrgb(137, 217, 100);
        padding: 40px;
        text-align: center;
        background: linear-gradient(45deg, #aaf55a, #577237);
        border-radius: 10px;
        }
        .window{
        background: linear-gradient(45deg, #aaf55a, #577237);
        width: 360px;
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
$inicio = $_POST["inc"];
$fim = $_POST["fim"];
$somimp = 0;
for ($i = $inicio; $i <= $fim; $i++){
    if ($i % 2 != 0){
        $somimp += $i;
    }
}
echo "<div class='container'><div class='windowdaora'><input type='text' class='window' readonly placeholder='Maior e Menor'><button class='close' onclick='history.back()'>X</button></div><div class='borda'>";
echo "<h2>Resultado:</h2>";
echo "Soma dos números impares entre ".$inicio." e ".$fim.": <br>";
echo $somimp;
echo "</div> </div>";
?>