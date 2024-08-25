import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] srgs) {
		Scanner ler = new Scanner(System.in);
	System.out.println("Forneça o valor da base maior do trapézio:");
	double basem=ler.nextDouble();
	System.out.println("Forneça o valor da base menor do trapézio:");
	double basemn=ler.nextDouble();
	System.out.println("Por último, forneça a altura:");
	double alt=ler.nextDouble();
	double soma=((basem+basemn)*alt)/2;
	System.out.println("A área do seu trapézio é igual a: " + soma);
	}
}
