document.addEventListener('DOMContentLoaded', (event) => {
    const botao = document.getElementById('esticarFoto');
    const imagem = document.getElementById('imagemm');

function esticarImagem() {
    const tamanhoAtual = imagem.clientHeight; // Altura atual da imagem
    const novoTamanho = tamanhoAtual * 1.2; // Aumenta a altura em 20%
    imagem.style.height = novoTamanho + 'px';
}
botao.addEventListener('click', esticarImagem);
});