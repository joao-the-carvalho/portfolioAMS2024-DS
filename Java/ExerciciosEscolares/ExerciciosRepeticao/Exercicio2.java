import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	
		Scanner receba = new Scanner(System.in);
		System.out.println("=== Calculadora de Tabuada === \n\n Digite um número para ver sua tábuada: ");
		int c = receba.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(c * i);
			i++;
		}
}
}
