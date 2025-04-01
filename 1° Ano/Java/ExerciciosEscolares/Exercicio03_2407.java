import javax.swing.JOptionPane;
import java.util.Calendar;

public class Exercicio03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
        int diaat = cal.get(Calendar.DAY_OF_MONTH);
        int mesat = cal.get(Calendar.MONTH) + 1; // fazendo +1 pq os meses sao baseados em 0
        int anoat = cal.get(Calendar.YEAR);
		int dia, mes, ano, idade;
		
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de nascimento:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mês de nascimento: (em números)"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
		idade = anoat - ano; //calculo da idade basica
		
		if (mesat < mes || (mesat == mes && diaat < dia)) {
            idade--; //calculo pra ajustar a idade caso nao tenha chego o aniversario ainda
        }
		
		if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Você é menor de idade.");
		}
		else if (idade >= 60){
			JOptionPane.showMessageDialog(null, "Você é idoso.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você atingiu a maioridade.");
		}
	}
}
