import javax.swing.JOptionPane;
import java.util.Arrays;
public class Ex5 {
	    public static void main(String[] args) {
	        int[][] matriz = new int[3][5];


	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número na posição [" + i + "][" + j + "]:"));
	            }
	        }


	        boolean repeteNums = false;
	        int[] elementos = new int[15];
	        int index = 0;

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                elementos[index++] = matriz[i][j];
	            }
	        }

	        Arrays.sort(elementos);
	        for (int i = 1; i < elementos.length; i++) {
	            if (elementos[i] == elementos[i - 1]) {
	                repeteNums = true;
	                break;
	            }
	        }

	        if (repeteNums) {
	            JOptionPane.showMessageDialog(null, "A matriz possui elementos repetidos.");
	        } else {
	            JOptionPane.showMessageDialog(null, "A matriz não possui elementos repetidos.");
	        }


	        int qtdPares = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (matriz[i][j] % 2 == 0) {
	                    qtdPares++;
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + qtdPares);


	        int qtdImpar = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (matriz[i][j] % 2 != 0) {
	                    qtdImpar++;
	                }
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Quantidade de números ímpares: " + qtdImpar);
	    }
	}
