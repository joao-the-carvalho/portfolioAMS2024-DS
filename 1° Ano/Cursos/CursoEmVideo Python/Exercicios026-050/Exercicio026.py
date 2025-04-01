frase = input('Digite uma frase: ').upper().strip()
print('A letra A aparece {} vezes'.format(frase.upper().count('A')))
print('Aparece pela primeira vez na posição {}'.format(frase.find('A')+1))
print('E pela última vez na posição {}'.format(frase.rfind('A')+1))