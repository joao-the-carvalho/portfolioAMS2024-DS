import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            ePar(n1);
    }
    public static void ePar(int n1){
        if (n1 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Você digitou um número imSpar!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Você digitou um número par!");
        }
    }
}
