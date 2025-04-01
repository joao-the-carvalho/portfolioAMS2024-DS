import java.util.Random;
import javax.swing.JOptionPane;
public class ExercicioRandom {
	public static void main(String[] args) {
		Random randomizado = new Random();
		int CPU = randomizado.nextInt(10);
		int inputdaora;
		inputdaora = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10"));
		while (inputdaora != CPU) {
			if (inputdaora < CPU) {
				inputdaora = Integer.parseInt(JOptionPane.showInputDialog("Seu número é menor, tente novamente."));
			}
			else if (inputdaora > CPU) {
				inputdaora = Integer.parseInt(JOptionPane.showInputDialog("Seu número é maior, tente novamente."));
			}
		}
		if (inputdaora == CPU) {
			JOptionPane.showMessageDialog(null, "Meus parabéns, você acertou!");
		}
		
	}
}
