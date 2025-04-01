from math import sin, cos, tan, radians
ang = float(input('Digite o Ângulo que você deseja: '))
seno = sin(radians(ang))
print('O Ângulo de {} tem o Seno de {:.2f}'.format(ang, seno))
coss = cos(radians(ang))
print('O Ângulo de {} tem o Cosseno de {:.2f}'.format(ang, coss))
tang = tan(radians(ang))
print('O Ângulo de {} tem a Tangente de {:.2f}'.format(ang, tang))
