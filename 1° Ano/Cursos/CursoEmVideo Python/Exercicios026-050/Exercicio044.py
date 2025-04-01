print(('{:=^40}').format(' LOJAS GUANABARA '))
preco = float(input('Preço das compras: R$'))
print('''FORMAS DE PAGAMENTO
[ 1 ] à vista dinheiro/cheque
[ 2 ] à vista cartão
[ 3 ] 2x no cartão
[ 4 ] 3x ou mais no cartão''')
opc = int(input('Qual é a opção? '))
if opc == 1:
    total = preco - (preco*0.1)
elif opc == 2:
    total = preco - (preco*0.05)
elif opc == 3:
    total = preco
    parcela = total/2
    print('Sua compra será parcelada em 2x de {:.2f} SEM JUROS  '.format(parcela))
elif opc == 4:
    total = preco + (preco * 0.2)
    parc = int(input('Quantas parcelas? '))
    totparc = total / parc
    print('Sua compra será parcelada em {}x de R${:.2f} COM JUROS.'.format(parc, totparc))
print('Sua compra de R${:.2f} vai custar R${:.2f} no final.'.format(preco, total))