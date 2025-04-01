import random
from enum import IntEnum
class Action(IntEnum):
    pedra = 0
    papel = 1
    tesoura = 2
    lagarto = 3
    spock = 4

acoes_cpu = ["pedra", "papel", "tesoura", "lagarto", "spock"]
usuario = input("Escolha uma opção (pedra, papel, tesoura, lagarto, spock) ")
cpu = random.choice(acoes_cpu)

try:
    usuario = Action[usuario]
    cpu = Action[cpu]
except KeyError:
    print("Opção inválida!")
    exit(1)
def determinar_vencedor(usuario, cpu):
    vitoria = {
        Action.tesoura: [Action.lagarto, Action.papel],
        Action.papel: [Action.spock, Action.pedra],
        Action.pedra: [Action.lagarto, Action.tesoura],
        Action.lagarto: [Action.spock, Action.papel],
        Action.spock: [Action.tesoura, Action.pedra]
    }
    
    if usuario == cpu:
        print(f"Os dois escolheram {usuario.name}. Empate!")
    elif cpu in vitoria[usuario]:
        print(f"{usuario.name} derrota {cpu.name}! Você ganhou!")
    else:
        print(f"{cpu.name} derrota {usuario.name}! Você perdeu.")

print(f"\nVocê escolheu: {usuario.name}, e a CPU escolheu {cpu.name}. \n")
determinar_vencedor(usuario, cpu)
