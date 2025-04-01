function calcularIdade() {
    const nasc = document.getElementById("anoNascimento").value;
    const ano = new Date().getFullYear();
    const idade = ano - nasc;

    if (nasc && idade >= 0) {
        document.getElementById("resultado").innerText = `você tem ${idade} anos.`;
    } 
    else {
        document.getElementById("resultado").innerText = "por favor, insira um ano de nascimento válido.";
    }
}