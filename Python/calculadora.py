def calcular():

    z = int(input("1 = +, 2 = -, 3 = *, 4 = /:"))
    x = int(input("X:"))
    y = int(input("Y:"))

    if z == int:
     if z == 1: 
        print('{} + {} = '.format(x, y))
        print(x + y)
    elif z == 2: 
        print('{} - {} = '.format(x, y))
        print(x - y)
    elif z == 3:
        print('{} * {} = '.format(x, y))
        print(x * y)
    elif z == 4:
        print('{} / {} = '.format(x, y)) 
        print(x / y)
    else:
        print('ta errado burro')

calcular()