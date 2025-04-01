import javax.swing.JOptionPane;
public class Exercicio01 {

    public static void main(String[] args) {
        Double n1, n2, n3, n4, med;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota: "));
        med = (n1+n2+n3+n4) / 4;
        if (med >= 5){
            JOptionPane.showMessageDialog(null, "Parabéns, sua média (" + med + "), é acima de 5!");
        }
    }
}
