prim = int(input('Digite um número: '))
raz = int(input('Digite a razão do termo da progressão aritmética:'))
dec = prim + (10 - 1) * raz
for i in range(prim, dec, raz):
    print('{} '.format(i), end='> ')
print('FIM')