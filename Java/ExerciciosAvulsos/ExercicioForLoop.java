import javax.swing.JOptionPane;
public class ExercicioForLoop {
	public static void main(String[] args) {
	int par = 0, impar = 0;
		for (int i = 1; i <= 5; i++) {
			int inputdaora = Integer.parseInt(JOptionPane.showInputDialog("Digite 5 numeros, um por um:"));

		if (inputdaora % 2 != 0) {
		impar++;
		}
		else {
		par++;
		}
	}
	JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + par + "\nQuantidade de números impares: " + impar);
}
}
