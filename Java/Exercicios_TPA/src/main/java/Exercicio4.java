import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner alturadeg= new Scanner(System.in);
		Scanner alturausu= new Scanner(System.in);
		System.out.println("Forneça a altura do degrau (em centimentros):");
		double centi = alturadeg.nextDouble();
		System.out.println("Forneça a altura que você quer subir (em centimetros, também):");
		double subir = alturausu.nextDouble();
		double degrau = centi/100;
		double altura = subir/100;
		double total = altura/degrau;
		System.out.println("Você precisará de " + total + " degraus para subir " + altura + " metros");
	}
}
