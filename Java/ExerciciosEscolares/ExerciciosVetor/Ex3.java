import java.util.Arrays;
import java.util.Scanner;
public class Ex3 {
public static void main(String[] args) {
	int[] numeros = new int[50];
    Scanner receba = new Scanner(System.in);
    System.out.println("Digite 50 números:");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        numeros[i] = receba.nextInt();
    }
	Arrays.sort(numeros);

	System.out.println("\nNúmeros em ordem crescente:");
	for (int numero : numeros) {
	System.out.println(numero);
}
receba.close();
}
}