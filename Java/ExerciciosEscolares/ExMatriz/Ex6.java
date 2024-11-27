import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        double[][] matriz = new double[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe o número na posição [" + i + "][" + j + "]:"));
            }
        }


        String diagonalPrincipal = "Valores da diagonal principal:\n";
        for (int i = 0; i < 4; i++) {
            diagonalPrincipal += matriz[i][i] + " ";
        }
        JOptionPane.showMessageDialog(null, diagonalPrincipal);


        String diagonalSecundaria = "Valores da diagonal secundária:\n";
        for (int i = 0; i < 4; i++) {
            diagonalSecundaria += matriz[i][3 - i] + " ";
        }
        JOptionPane.showMessageDialog(null, diagonalSecundaria);
    }
}