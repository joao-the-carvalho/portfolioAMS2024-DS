print("Me fale uma medida em centímetros:")
centimetros = int(input())
decimetros = float(centimetros) / 10
metros = float(centimetros) / 100
milimetros = centimetros * 10
print("Essa medida em centimetros tem o comprimento de: " + str(decimetros) + " decimetros, " + str(metros) + " metros e " + str(milimetros) + " milimetros.")
