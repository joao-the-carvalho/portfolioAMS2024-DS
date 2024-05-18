import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner custo = new Scanner(System.in);
		Scanner convite = new Scanner(System.in);
		System.out.println("Me forneça quanto custou o espetáculo teatral:");
		int espet = custo.nextInt();
		System.out.println("Me forneça o valor de cada convite:");
		int conv = convite.nextInt();
		int total = espet/conv;
		System.out.println("Para alcançar os custos do espetáculo teatral, você precisaria vender " + total + " convites.");
	}
}
