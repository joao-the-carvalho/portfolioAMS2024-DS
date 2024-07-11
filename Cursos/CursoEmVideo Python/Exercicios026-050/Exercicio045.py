from random import randint
from time import sleep
itens = ('Pedra', 'Papel', 'Tesoura')
cpu = randint(0, 2)
print('''Suas opções:
[ 0 ] Pedra
[ 1 ] Papel
[ 2 ] Tesoura''')
esc = int(input('Qual é sua Jogada? '))
print('Jó')
sleep(1)
print('Ken')
sleep(1)
print('Po!')
print('-=' * 11)
print('A CPU jogou {}'.format(itens[cpu]))
print('Você jogou {}'.format(itens[esc]))
print('-=' * 11)
if cpu == 0:
    if esc == 0:
        print('EMPATE')
    elif esc == 1:
        print('O Jogador vence!')
    elif esc == 2:
        print('O Computador vence!')
    else:
        print('JOGADA INVÁLIDA')
if cpu == 1:
    if esc == 0:
        print('O Computador vence!')
    elif esc == 1:
        print('EMPATE')
    elif esc == 2:
        print('O Jogador vence!')
    else:
        print('JOGADA INVÁLIDA')
if cpu == 2:
    if esc == 0:
        print('O Jogador vence!')
    if esc == 1:
        print('O Computador vence!')
    if esc == 2:
        print('EMPATE')
    else:
        print('JOGADA INVÁLIDA')
