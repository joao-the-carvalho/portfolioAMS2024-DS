from random import randint
from time import sleep
itens = ('Pedra', 'Papel', 'Tesoura', 'Lagarto', 'Spock')
cpu = randint(0, 4)
print('''Suas opções:
[ 0 ] Pedra
[ 1 ] Papel
[ 2 ] Tesoura
[ 3 ] Lagarto
[ 4 ] Spock''')
esc = int(input('Qual é sua Jogada? '))
print('Jó')
sleep(0.3)
print('Ken')
sleep(0.3)
print('Po!')
print('-=' * 11)
print('A CPU jogou {}'.format(itens[cpu]))
print('Você jogou {}'.format(itens[esc]))
print('-=' * 11)
if cpu == esc:
    print('EMPATE')
if esc < 0 or esc > 4:
    print('JOGADA INVÁLIDA')
if cpu == 0:
    if esc == 1 or esc == 4:
        print('O Jogador vence!')
    elif esc == 2 or esc == 3:
        print('O Computador vence!')
if cpu == 1:
    if esc == 0 or esc == 4:
        print('O Computador vence!')
    elif esc == 2 or esc == 3:
        print('O Jogador vence!')
if cpu == 2:
    if esc == 0 or esc == 4:
        print('O Jogador vence!')
    if esc == 1 or esc == 3:
        print('O Computador vence!')
if cpu == 3:
    if esc == 0 or esc == 2:
        print('O Computador vence!')
    elif esc == 1 or esc == 4:
        print('O Jogador vence!')
if cpu == 4:
    if esc == 1 or esc == 3:
        print('O Computador vence!')
    elif esc == 2 or esc == 4:
        print('O Jogador vence!')