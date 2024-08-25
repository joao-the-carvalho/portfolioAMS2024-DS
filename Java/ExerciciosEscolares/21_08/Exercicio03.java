import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args){
		Scanner receba = new Scanner(System.in);
		System.out.println("-=-=-=-=-= Menu do McDonald's -=-=-=-=-=\n");
		System.out.print("Digite sua opção:\n 1. BigMac \n 2. Quarteirão \n 3. MacChicken \n 4. Cheddar \n 5.Cheese Burger\n	");
		int opt = receba.nextInt();
		switch (opt) {
		case 1:
			System.out.println("BigMac selecionado.");
			break;
		case 2:
			System.out.println("Quarteirão selecionado.");
			break;
		case 3:
			System.out.println("MacChicken selecionado.");
			break;
		case 4:
			System.out.println("Cheddar selecionado.");
			break;
		case 5:
			System.out.println("CheeseBurguer selecionado.");
			break;
		default:
			System.out.println("Esse número não faz parte do cardápio.");
		}
		System.out.println("Obrigado pelo seu pedido!");
	} 
}
