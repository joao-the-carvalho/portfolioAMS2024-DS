import javax.swing.JOptionPane;
public class Exercicio06 {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
		
		if (idade >= 5 && idade <= 7) {
            JOptionPane.showMessageDialog(null, "Categoria:\n Infantil A (5 a 7 anos)");
        }
        else if (idade >= 8 && idade <= 10) {
            JOptionPane.showMessageDialog(null, "Categoria:\n Infantil B (8 a 10 anos)");
        }
        else if (idade >= 11 && idade <= 13) {
            JOptionPane.showMessageDialog(null, "Categoria:\n Juvenil A (11 a 13 anos)");
        }
        else if (idade >= 14 && idade <= 17) {
            JOptionPane.showMessageDialog(null, "Categoria:\n Juvenil B (14 a 17 anos)");
        }
        else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Categoria:\n Senior (18+)");
	}
  }
}
