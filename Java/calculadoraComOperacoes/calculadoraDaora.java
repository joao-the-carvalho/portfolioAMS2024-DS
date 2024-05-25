import java.util.Scanner;

public class calculadoraDaora {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nota1;
    int nota2;
    int operacao;

    
    System.out.println("Digite o primeiro número:");
    nota1 = input.nextInt();
    System.out.println("Agora, o segundo:"); 
    nota2 = input.nextInt();
    System.out.println("Escolha a operação: (1 = +, 2 = -, 3 = *, 4 = /)");
    operacao = input.nextInt();
    int resultado = 0;
    boolean valido = true;
switch (operacao) {
    case 1:
    resultado = nota1 + nota2;
break;
case 2:
    resultado = nota1 - nota2;
    break;
case 3:
resultado = nota1 * nota2;
break;
case 4:
resultado = nota1 / nota2;
break;
default:
    System.out.println("Operador inválido!");
    valido = false;
}

if (valido) {
    System.out.println("Resultado: " + resultado);
}



}
  }