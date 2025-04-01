import java.util.Scanner;

public class doubleTeste {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int  nota1;
    int nota2;

    System.out.println("Digite a primeira nota:");
    nota1 = input.nextInt();
    System.out.println("Agora a segunda:"); 
    nota2 = input.nextInt();
    double notaFinal = (nota1 +nota2)/2;
    System.out.print(notaFinal);
    System.out.print(", Essa é sua nota.");
    if (notaFinal >= 7 ) {
        System.out.println(" Parabéns!");
    }
    if (notaFinal <= 6.5) {
        System.out.println(" Se esforce mais no próximo bimestre!");
    }
    }
    
}