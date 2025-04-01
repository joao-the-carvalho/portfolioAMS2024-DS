
public class Ex5 {
	public static void main(String[] args) {
        int[] pares = new int[51];
        for (int i = 0; i < 51; i++) {
            pares[i] = i * 2;
        }
        
        System.out.println("Números pares de 0 a 100:");
        for (int numero : pares) {
            System.out.println(numero);
        }
	}
}
