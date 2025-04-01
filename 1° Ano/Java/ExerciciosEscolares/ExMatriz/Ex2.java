
public class Ex2 {
	    public static void main(String[] args) {
	        int[][] matriz = {{19, 25, 100, 99},
	                          {10, 7, 25, 14},
	                          {35, 2, 47, 74}};

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.printf("%4d ", matriz[i][j]);
	            }
	            System.out.println();
	        }
	    }
}
