import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner lernome= new Scanner(System.in);
		Scanner lersalario= new Scanner(System.in);
		System.out.println("Forneça o seu nome completo:");
		String nome= lernome.nextLine();
		System.out.println("Forneça seu salário fixo:");
		int salario= lersalario.nextInt();
		double comissao = salario*0.04;
		double salariof = salario + comissao;
		System.out.println("Seu nome completo é: " + nome + ", e seu salário é de: " + salario + " Reais. Você recebeu de comissão: " + comissao + " reais, e então seu salário final é: " + salariof);
		
	}
}
