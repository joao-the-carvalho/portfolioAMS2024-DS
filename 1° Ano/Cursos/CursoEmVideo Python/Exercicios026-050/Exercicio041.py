from datetime import date
diaatual = date.today()
anoatual = diaatual.year
ano = int(input('Digite seu ano de nascimento: '))
idade = anoatual - ano
if idade <= 9:
    print('MIRIM')
elif 10 <= idade <= 14:
    print('INFANTIL')
elif 15 <= idade <= 19:
    print('JUNIOR')
elif 20 <= idade <= 20:
    print('SÊNIOR')
elif idade > 20:
    print('MASTER')