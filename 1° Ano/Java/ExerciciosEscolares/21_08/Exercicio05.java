import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main(String[] args) {
		double n1, n2, n3, n4;
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 1° nota: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 2° nota: "));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 3° nota: "));
		n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua 4° nota: "));
		double media = (n1+n2+n3+n4)/4;
		if (media < 2.5 || (media >= 2.5 && media < 5)) {
		    JOptionPane.showMessageDialog(null, "Você foi reprovado.");
		}
		else if (5 <= media || (media < 7)) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado.");
		}
		else if (7 <= media || (media < 9)) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado.");
		}
		else if (9 <= media) {
			JOptionPane.showMessageDialog(null, "Você foi aprovado com excelência acadêmica.");
		}
		}
}
