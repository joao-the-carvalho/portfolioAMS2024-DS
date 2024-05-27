initialweight = int(input("Digite o Primeiro Peso em KGs:"))
convert = int(input("Digite para o que você gostaria de converter o peso: (1: LBs; 2: gramas; 3: toneladas):"))
weightlb = float(initialweight * 2.205)
weightg = float(initialweight*1000)
weightton = float(initialweight/1000)
if convert == 1:
    print("O seu peso (em KGs) convertido para libras é igual á:")
    print(weightlb)
elif convert == 2:
    print("O seu peso (em KGs) convertido para gramas é igual á:")
    print(weightg)
elif convert == 3:
    print("O seu peso (em KGs) convertido para toneladas é igual á:")
    print(weightton)
