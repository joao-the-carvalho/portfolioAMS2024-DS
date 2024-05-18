import java.util.Scanner;
public class Exercicio2 {
 public static void main(String[] args) {
	 Scanner ler= new Scanner(System.in);
	 System.out.println("Forneça a quantidade de reais que voce possui pra viagem");
	 double real=ler.nextInt();
	 double dolar=real/1.80;
	 double marco=real/2.00;
	 double libra=real/1.57;
	 System.out.println("Em Dólares, essa quantidade é igual á: " + dolar);
	 System.out.println("Em Marcos Alemães, essa quantidade é igual á: " + marco);
	 System.out.println("Em Libras Esterlinas, essa quantidade é igual á: " + libra);
 }
}
