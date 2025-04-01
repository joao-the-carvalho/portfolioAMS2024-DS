import javax.swing.JOptionPane;
public class Ex8 {
public static void main(String[] args) {
	final int N_Lin = 3, N_Col = 3;
	int[][] mat = new int [N_Lin][N_Col];
	int l, c;
	
JOptionPane.showMessageDialog(null, "******* Cadastrando dados na Matriz *******\n Entre com o valor de cada posição da matriz");

	// atribuição de valores na matriz
for (l = 0; l < N_Lin; l++) {
    for (c = 0; c < N_Col; c++) {
        mat[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor linha " + (l + 1) + " coluna " + (c + 1) + " :"));
    }//fim do for da coluna
}//fim do for da linha

JOptionPane.showMessageDialog(null, "******* Exibindo os dados da matriz *******");

	//exibição dos valores na matriz
	for(l = 0; l < N_Lin; l++) {
		for(c = 0; c < N_Col; c++) {
			System.out.println(mat[l][c]+ " ");
		}//fim do for da coluna
		System.out.println("\n");//organizar em linhas diferentes
	}//fim do for da linha
}
}
