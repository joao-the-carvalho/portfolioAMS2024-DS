import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número na posição [" + i + "][" + j + "]:"));
            }
        }
        int sumImp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    sumImp += matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Soma dos números ímpares: " + sumImp);

      
        JOptionPane.showMessageDialog(null, "Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int sumCol = 0;
            for (int i = 0; i < 5; i++) {
                sumCol += matriz[i][j];
            }
            JOptionPane.showMessageDialog(null, "Coluna " + j + ": " + sumCol);
        }

       
        JOptionPane.showMessageDialog(null, "Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int sumLinha = 0;
            for (int j = 0; j < 5; j++) {
                sumLinha += matriz[i][j];
            }
            JOptionPane.showMessageDialog(null, "Linha " + i + ": " + sumLinha);
        }
    }
}