soma = 0
for c in range(1, 501, 2):
    if c%3 == 0:
        soma = soma + c
print('a soma de todos os valores impares é igual á: {}'.format(soma))