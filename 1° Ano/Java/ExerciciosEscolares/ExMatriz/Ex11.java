import javax.swing.JOptionPane;

public class Ex11 {
    private static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    private static char jogAtual = 'X';

    public static void main(String[] args) {
        boolean comecou = true;

        while (comecou) {
            mostrarTab();
            

            String linhaInp = JOptionPane.showInputDialog("Jogador " + jogAtual + ", escolha a linha (1, 2 ou 3):");

            String inputCol = JOptionPane.showInputDialog("Jogador " + jogAtual + ", escolha a coluna (1, 2 ou 3):");
            
            if (linhaInp != null && inputCol != null && linhaInp.matches("[1-3]") && inputCol.matches("[1-3]")) {
                int linha = Integer.parseInt(linhaInp) - 1;
                int coluna = Integer.parseInt(inputCol) - 1;

                if (tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogAtual;

                    if (quemGanhou()) {
                        mostrarTab();
                        JOptionPane.showMessageDialog(null, "Parabéns! Jogador " + jogAtual + " venceu!");
                        comecou = false;
                    } else if (verifEmpate()) {
                        mostrarTab();
                        JOptionPane.showMessageDialog(null, "O jogo terminou em empate!");
                        comecou = false;
                    } else {
                        jogAtual = (jogAtual == 'X') ? 'O' : 'X';
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Movimento inválido. Tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Insira um número entre 1 e 3.");
            }
        }
    }

    private static void mostrarTab() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tabuleiro:\n");
        sb.append("  1   2   3\n");
        for (int i = 0; i < 3; i++) {
            sb.append((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                sb.append(tabuleiro[i][j]);
                if (j < 2) sb.append(" | ");
            }
            sb.append("\n");
            if (i < 2) sb.append(" -----------\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static boolean quemGanhou() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogAtual && tabuleiro[i][1] == jogAtual && tabuleiro[i][2] == jogAtual) return true;
            if (tabuleiro[0][i] == jogAtual && tabuleiro[1][i] == jogAtual && tabuleiro[2][i] == jogAtual) return true;
        }
        return (tabuleiro[0][0] == jogAtual && tabuleiro[1][1] == jogAtual && tabuleiro[2][2] == jogAtual) || // Diagonal
               (tabuleiro[0][2] == jogAtual && tabuleiro[1][1] == jogAtual && tabuleiro[2][0] == jogAtual); // Diagonal
    }

    private static boolean verifEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true; 
    }
}