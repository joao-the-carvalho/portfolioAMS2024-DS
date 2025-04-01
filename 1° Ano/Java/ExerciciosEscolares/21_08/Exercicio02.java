import javax.swing.JOptionPane;
public class Exercicio02 {
    public static void main(String[] args) {
    double massa, alt;
    double imc;
    massa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua massa em KGs: "));
    alt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura em centímetros: "))/100;
    imc = massa/(alt*alt);
          
    if (imc < 18){
        JOptionPane.showMessageDialog(null, "Você está no grupo: MAGREZA.");
    }
    else if (imc < 25){
        JOptionPane.showMessageDialog(null, "Você está no grupo: SAUDÁVEL.");
    }
    else if (imc < 30){
        JOptionPane.showMessageDialog(null, "Você está no grupo: SOBREPESO.");
    }
    else if (imc >= 30){
        JOptionPane.showMessageDialog(null, "Você está no grupo: OBESIDADE.");
    }
    }
}
