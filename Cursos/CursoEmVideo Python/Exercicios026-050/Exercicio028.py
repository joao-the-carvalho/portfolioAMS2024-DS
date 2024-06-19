from random import random, randint
num = randint(0, 5)
adivinha = int(input('Digite um número de 0 a 5: '))
if adivinha == num:
    print('Meus parabéns, você adivinhou corretamente!')
else:
    print('Você errou...')