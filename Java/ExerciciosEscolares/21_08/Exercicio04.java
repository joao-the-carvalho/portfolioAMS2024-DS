import javax.swing.*;
public class Exercicio04 {
	public static void main(String [] args) {
		int mes;
		mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro entre 1 e 12:"));
		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Esse número é inválido!");
		}
			else {
				String nomedomes;
		switch (mes) {
		case 1: nomedomes = "Janeiro"; break;
		case 2: nomedomes = "Fevereiro"; break;
		case 3: nomedomes = "Março"; break;
		case 4: nomedomes = "Abril"; break;
		case 5: nomedomes = "Maio"; break;
		case 6: nomedomes = "Junho"; break;
		case 7: nomedomes = "Julho"; break;
		case 8: nomedomes = "Agosto"; break;
		case 9: nomedomes = "Setembro"; break;
		case 10: nomedomes = "Outubro"; break;
		case 11: nomedomes = "Novembro"; break;
		case 12: nomedomes = "Dezembro"; break;
		default: nomedomes = "Inválido";
		}
		JOptionPane.showMessageDialog(null, "O mês selecionado é: " + nomedomes);
			}
		}
	}
