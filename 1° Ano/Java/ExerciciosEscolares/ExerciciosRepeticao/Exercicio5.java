import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		int vi = receba.nextInt();
		System.out.println("Informe o segundo valor: ");
		int vf = receba.nextInt();
		
		int nummaior, nummenor;
        if (vi > vf) {
            nummaior = vi;
            nummenor = vf;
        } else {
            nummaior = vf;
            nummenor = vi;
        }
		
		System.out.println("Números pares entre " + nummenor + " e " + nummaior + " em ordem decrescente: ");
		for (int i = nummaior; i >= nummenor; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
