import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        Scanner receba = new Scanner(System.in);
    
        System.out.println("Digite 50 números diferentes:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = receba.nextInt();
        }
        
        Arrays.sort(numeros, Collections.reverseOrder());
        
        System.out.println("\nNúmeros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        receba.close();
    }
}