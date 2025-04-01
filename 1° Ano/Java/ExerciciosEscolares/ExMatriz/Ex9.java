import javax.swing.JOptionPane;
public class Ex9 {
public static void main(String[] args) {
	        double[][] matriz = {{4.5, 5.2}, {4.4, 1.1}};

	        JOptionPane.showMessageDialog(null, "******** Imprimindo a matriz *******");

	        for (int x = 0; x < 2; x++) {
	            for (int y = 0; y < 2; y++) {
	                System.out.println("mat[" + x + "][" + y + "] = " + matriz[x][y]);
	            }//fim do for da coluna (y)
	        }// fim do for da linha (x)
	    }
	}
