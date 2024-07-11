from datetime import date
ano = 0
totmaior = 0
totmenor = 0
diaatual = date.today()
anoatual = diaatual.year
for a in range(0, 7):
    ano = int(input('Digite seu ano de nascimento: '))
    if ano >= 18:
        totmaior =+ 1
    else:
        totmenor =+ 1
print('total de maiores: {} \n total de menores: {}'.format(totmaior, totmenor))