import javax.swing.JOptionPane;
public class AnotherOne {
    public static void main(String[] args) {
        int n1;
        do {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Calculadora de Fatoriais\n\nDigite um número que nao " +
                    "seja 0 nem 1: "));
        } while (n1 < 2);
        JOptionPane.showMessageDialog(null, "O fatorial de "+n1+" é igual á: ");
        fatorial(n1);
    }
    public static void fatorial(int n1){
        int result = 1;
        for (int i = 1;i <= n1;i++){
            result *= i;
            JOptionPane.showMessageDialog(null, "Passo " + i + ": " + result);
        }
    }
}
