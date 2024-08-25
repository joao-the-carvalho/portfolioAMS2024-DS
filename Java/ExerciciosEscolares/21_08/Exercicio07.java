import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Você irá digitar duas datas no formato dia/mês/ano.");
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da primeira data:"));
        int m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da primeira data:"));
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da primeira data:"));

        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da segunda data:"));
        int m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da segunda data:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da segunda data:"));
        
        if (d1 > 31 || d1 < 1 && d2 > 31 || d2 < 1 && m1 > 12 || m1 < 1 && m2 > 12 || m2 < 1) {
        	JOptionPane.showMessageDialog(null, "Data inválida!");
        }
        if (a1 < a2 || (a1 == a2 && m1 < m2) || (a1 == a2 && m1 == m2 && d1 < d2)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente das datas:\n" + d1 + "/" + m1 + "/" + a1 + "\n" + d2 + "/" + m2 + "/" + a2);
        } else if (a1 > a2 || (a1 == a2 && m1 > m2) || (a1 == a2 && m1 == m2 && d1 > d2)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente das datas:\n" + d2 + "/" + m2 + "/" + a2 + "\n" + d1 + "/" + m1 + "/" + a1);
        } else {
            JOptionPane.showMessageDialog(null, "As datas são iguais:\n" + d1 + "/" + m1 + "/" + a1);
        }
    }
}