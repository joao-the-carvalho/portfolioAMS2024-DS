Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/03/2024
Var
// Seção de Declarações das variáveis 
nome: caracter
nota1, nota2, nota3, nota4: inteiro
notf: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("qual é seu nome?")
leia(nome)
escreval("me diga 4 notas suas")
leia(nota1, nota2, nota3, nota4)
notf <- nota1+nota2+nota3+nota4
escreval(notf/4)
Fimalgoritmo