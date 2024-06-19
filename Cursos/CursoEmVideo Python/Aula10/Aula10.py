#nome = input('Qual é seu nome? ')
#if nome == 'Gustavo':
#    print('Que nome lindo você tem!')
#else:
#    print('Seu nome é muito normal...')
#print('Bom dia, {}!'.format(nome))

n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
m = (n1+n2)/2
print('A sua média foi {:.1f}'.format(m))
if m >= 6.0:
    print('Sua média foi boa, parabéns!')
else:
    print('Sua média foi baixa.. Estude mais!')