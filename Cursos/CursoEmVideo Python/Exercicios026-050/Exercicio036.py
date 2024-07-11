casa = float(input('Valor da casa: R$'))
salario = float(input('Salário do comprador: R$'))
ano = int(input('Quantos anos de financiamento? '))
prestacao = casa / (ano*12)
minimo = salario * 0.3
print('Para pagar uma casa de {:.2f} em {} anos'.format(casa, ano), end = '')
print(' a prestação será de R${:.2f}'.format(prestacao))
if prestacao <= minimo:
    print('O emprestimo pode ser CONCEDIDO')
else:
    print('Emprestimo NEGADO')