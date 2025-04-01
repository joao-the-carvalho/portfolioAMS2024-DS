<!DOCTYPE html>
<html lang="en">
<head>
    <title>Resultado da Tabuada</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
    <style>
        body, html{
            background-image: url(https://i.imgur.com/bRINBhe.jpeg);
            background-size: cover;
    overflow-x: hidden; 
    overflow-y: hidden;
        }
        .container{
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 0;
        }
        .borda{
            border: 2px solid #64a4d9;
        padding: 40px;
        text-align: center;
        background: linear-gradient(45deg, #4e6a8e, #5a9df5);
        border-radius: 10px;
        color: aliceblue;
        opacity: 0.85;
        }
        
    </style>
     <div class="container">
     <div class="windowdaora"><input type="text" class="window" readonly placeholder="Maior e Menor"><button class="close" type="reset">X</button></div>
     <div class="borda">
    <?php
    $i = 0;
    $num = $_POST["num"];
    echo "<h3> Tabuada do ".$num.": </h2>";
    while($i <= 10){
        $tab = $num * $i;
        echo "<h3>".$num.' X '.$i.' = '.$tab.'</h3> <br>';
        $i++;
    }
    ?>
    </div>
    </div>
</body>
</html>