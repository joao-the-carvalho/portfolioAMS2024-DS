dist = int(input('Digite a distância da sua viagem (em KM): '))
if dist <= 200:
    print('O valor dessa viagem será de R${}'.format(dist*0.50))
else:
    print('O valor dessa viagem será de R${}'.format(dist*0.45))