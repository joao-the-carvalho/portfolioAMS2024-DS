veloc = int(input('Digite a velocidade de um carro: '))
if veloc <= 80:
    print('Tudo ok')
else:
    print('Pare, você foi multado!')
    print('O valor que você pagará pela multa é de R${}!'.format((veloc - 80)*7))