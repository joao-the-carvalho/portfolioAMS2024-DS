import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] args) {
        int[][] matriz = {
            {42, 23, 12},
            {22, 55, 64},
            {14, 78, 91}
        };

        StringBuilder sb = new StringBuilder();
        sb.append("Valores da matriz:\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sb.append(matriz[i][j]).append(" ");
            }
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString(), "Exibindo Elementos da Matriz", JOptionPane.INFORMATION_MESSAGE);
    }
}
