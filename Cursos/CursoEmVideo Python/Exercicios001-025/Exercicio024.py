cidade = input('Digite a cidade que você mora: ').strip()
print('Santo está no nome da sua cidade? {}'.format(cidade[:5].upper() == 'SANTO'))