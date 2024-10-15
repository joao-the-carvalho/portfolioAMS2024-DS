function verificarParOuImpar() {
    const numero = document.getElementById('numero').value;
    if (numero % 2 === 0) {
        document.getElementById('resultado').textContent = `O número ${numero} é par!`;
    } else {
        document.getElementById('resultado').textContent = `O número ${numero} é ímpar!`;
    }
}