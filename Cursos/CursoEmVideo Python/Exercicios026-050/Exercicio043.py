peso = float(input('Digite seu peso: '))
altura = float(input('Digite sua altura: '))
imc = peso/(altura ** 2)
print('O valor do seu IMC é de {:.2f}'.format(imc))
if imc < 18.5:
    print('ABAIXO DO PESO')
elif 18.5 <= imc <= 25.0:
    print('PESO IDEAL')
elif 26 <= imc <= 30:
    print('SOBREPESO')
elif 31 <= imc <= 40:
    print('OBESIDADE')
elif imc > 40:
    print('OBESIDADE MÓRBIDA')