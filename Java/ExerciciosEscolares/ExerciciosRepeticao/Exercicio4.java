import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		
	Scanner receba = new Scanner(System.in);
	System.out.println("Digite o valor inicial do intervalo:");
	int vi = receba.nextInt();
	System.out.println("Agora, digite o valor final: ");
	int vf = receba.nextInt();
	
	int soma = 0;
	for (int i = vi; i <= vf; i++) {
		if (i%2 != 0) {
			soma += i;
		}
	}
	System.out.println("A soma dos números ímpares entre " + vi + " e " + vf + " é: " + soma);
	
}
}
