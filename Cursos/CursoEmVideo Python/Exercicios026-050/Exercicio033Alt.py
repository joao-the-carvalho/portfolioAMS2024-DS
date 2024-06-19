n1 = int(input('Primeiro valor: '))
n2 = int(input('Segundo valor: '))
n3 = int(input('Terceiro valor: '))
L = [n1, n2, n3]
L.sort()
print('O maior número foi {} e o menor é {}.'.format(L[2], L[0]))