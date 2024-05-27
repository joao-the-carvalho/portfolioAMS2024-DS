tipoconversor= int(input("Quais unidades você quer converter? (1: quilos, 2: gigabytes, 3:temperatura):"))





if tipoconversor == 1:
    quiloinicial= int(input("quantos quilos você quer converter?"))
    tipoquilo= int(input("para qual unidade você quer converter? (1: LBs; 2: gramas; 3: toneladas)"))
    if tipoquilo == 1:
        lb = float(quiloinicial*2.205)
        print(lb)
    elif tipoquilo == 2:
        grama= float(quiloinicial*1000)
        print(grama)
    elif tipoquilo == 3:
        ton= float(quiloinicial/1000)
        print(ton)


elif tipoconversor == 2:    
    gigainicial= int(input("quantos gigabytes você quer converter?"))
    tipogiga= int(input("para qual armazenamento você quer converter? (1: Megabytes, 2: terabytes, 3:kilobytes)"))
    if tipogiga == 1:
        mb= float(gigainicial*1000)
        print(mb)
    elif tipogiga == 2:
        tb= float(gigainicial/1000)
        print(tb)
    elif tipogiga == 3:
        kb= float(gigainicial*1e+6)
        print(kb)


elif tipoconversor == 3:    
    tempinicial= int(input("quantos graus (celsius) você quer converter?"))
    tipotemp= int(input("para qual temperatura você quer converter? (1:fahrenheit, 2:kelvin)"))
    if tipotemp == 1:
        fahrenheit= float((tempinicial*9/5) + 32)
        print(fahrenheit)
    elif tipotemp == 2:
        kelvin= float(tempinicial + 273.15)
        print(kelvin)
