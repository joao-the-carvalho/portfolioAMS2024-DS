const foto = document.getElementById('foto');
let rotation = 0;
const angle = 90;

function giragira() { 
    rotation = (rotation + angle) % 360;  
    foto.style.transform = `rotate(${rotation}deg)`;
}