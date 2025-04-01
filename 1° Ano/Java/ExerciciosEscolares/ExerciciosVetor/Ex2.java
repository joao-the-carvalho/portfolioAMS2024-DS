import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Ex2 {
public static void main(String[] args) {
	String[] nomes = new String[15];
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite 15 nomes:");
    for (int i = 0; i < nomes.length; i++) {
        System.out.print("Nome " + (i + 1) + ": ");
        nomes[i] = scanner.nextLine();
    }
    Arrays.sort(nomes, Collections.reverseOrder());
    System.out.println("\n todos os nomes em ordem decrescente:");
    for (String nome : nomes) {
        System.out.println(nome);
    }
    
    scanner.close();
}
}
