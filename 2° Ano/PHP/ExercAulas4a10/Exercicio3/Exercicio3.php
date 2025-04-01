<head>
    <title>Média Aritmética</title>
    <link rel="icon" type="image/x-icon" href="https://frutigeraeroarchive.org/images/icons/vista_netcenter.ico">
</head>
<body>
<style>
                @import url('https://fonts.googleapis.com/css2?family=Emblema+One&family=Orbitron:wght@400..900&display=swap');
        body, html{
            background-image: url(https://i.imgur.com/K09kp36.jpeg);
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
            border: 2px solid #d28f2a;
        padding: 40px;
        text-align: center;
        background: linear-gradient(45deg, #b77427, #ca7423);
        border-radius: 10px;
        opacity: 0.85;
        }
    </style>
</html>
<?php
$n1 = $_POST["n1"];
$n2 = $_POST["n2"];
$n3 = $_POST["n3"];
$n4 = $_POST["n4"];
$media = ($n1 + $n2 + $n3 + $n4)/4;
echo "<div class='container'><div class='borda'>".$media."<br>";
if (5 <= $media){
    echo "Você está aprovado(a)!";
}
else{
    echo "Você reprovou, estude mais!";
}
echo "</div> </div>";
?>