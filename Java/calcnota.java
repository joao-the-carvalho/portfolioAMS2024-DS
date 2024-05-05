import java.util.*;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double notafinal;

        System.out.println("Nota 1:");
        nota1 = input.nextDouble();
        System.out.println("Nota 2:");
        nota2 = input.nextDouble();
        System.out.println("Nota 3:");
        nota3 = input.nextDouble();
        System.out.println("Nota 4:");
        nota4 = input.nextDouble();
        notafinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua nota final é:");
        System.out.println(notafinal);
    }
}
