dias = int(input('Quantos dias alugados? '))
km = int(input('Quantos KM rodados?'))
print('O total a ser pago é de R${:.2f}'.format((dias*60)+(km*0.15)))