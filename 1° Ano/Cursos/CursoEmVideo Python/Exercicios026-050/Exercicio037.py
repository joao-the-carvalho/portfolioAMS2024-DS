num = int(input('Digite um valor: '))
esc = int(input('Escolha um conversor: \n1 - Binário \n2 - Octal \n3 - Hexadecimal \n'))
if esc == 1:
    print('O valor convertido em binário é igual á: {}'.format(bin(num)))
elif esc == 2:
    print('O valor convertido para Octal é igual á: {}'.format(oct(num)))
elif esc == 3:
    print('O valor convertido para Hexadecimal é igual á {}'.format(hex(num)))
else:
    print('Esse valor é invalido!')