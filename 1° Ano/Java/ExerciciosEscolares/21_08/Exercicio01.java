import javax.swing.JOptionPane;
public class Exercicio01 {
    public static void main(String[] args) {    
    int hc;
    hc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora que você chega no trabalho: "));
        switch (hc) {
            case 5:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da manhã.");
                break;
            case 13:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da tarde.");
                break;
            case 21:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da noite.");
                break;
            default:
                break;
        }
    }
}
