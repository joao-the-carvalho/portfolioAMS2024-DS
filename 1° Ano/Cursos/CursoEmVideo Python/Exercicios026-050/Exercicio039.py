from datetime import date
diaatual = date.today()
anoatual = diaatual.year
ano = int(input('Digite seu ano de nascimento: '))
if anoatual - ano < 18:
    print('Você ainda irá se alistar no exército')
    print('Ainda faltam {} ano(s) para você alistar.'.format((ano+18) - anoatual))
if anoatual - ano == 18:
    print('Já é hora de você se alistar no exército.')
if anoatual - ano > 18:
    print('Já passou do tempo de você se alistar')
    print('Se passaram {} ano(s) desde que se passou do prazo.'.format(anoatual - ano - 18))