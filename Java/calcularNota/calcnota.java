import java.util.Scanner;
class calcnota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int notafinal;

        System.out.println("Nota 1:");
        nota1 = input.nextInt();
        System.out.println("Nota 2:");
        nota2 = input.nextInt();
        System.out.println("Nota 3:");
        nota3 = input.nextInt();
        System.out.println("Nota 4:");
        nota4 = input.nextInt();
        notafinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua nota final é:");
        System.out.println(notafinal);
    }
}
