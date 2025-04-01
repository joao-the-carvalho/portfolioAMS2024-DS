salario = float(input('Digite seu salário atual: '))
if salario <=1250.0:
    print('O valor do seu salário após um aumento é de: R${}'.format((salario*0.15)+salario))
else:
    print('O valor do seu salário após um aumento é de: R${}'.format((salario*0.1)+salario))