import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Exercicio02 {
	public static void main(String[] args) {
		Double qntdp = 50.0, pess;
		pess = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos quilos foram pescados: "));
		if (pess > qntdp)
		{
		Double multa = (pess - qntdp) * 4;
		DecimalFormat Formatar = new DecimalFormat("#.00");
		JOptionPane.showMessageDialog(null, "Por conta de você ter pego " + pess + " quilos, a multa que você irá pagar será de: R$" + Formatar.format(multa));
		}
			
	}
}
