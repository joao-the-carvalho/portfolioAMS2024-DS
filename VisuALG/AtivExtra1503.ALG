Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2024
Var
// Se��o de Declara��es das vari�veis 
nome: caracter
nota1, nota2, nota3, nota4: inteiro
notf: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("qual � seu nome?")
leia(nome)
escreval("me diga 4 notas suas")
leia(nota1, nota2, nota3, nota4)
notf <- nota1+nota2+nota3+nota4
escreval(notf/4)
Fimalgoritmo