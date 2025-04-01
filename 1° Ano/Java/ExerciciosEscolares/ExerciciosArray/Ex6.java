
public class Ex6 {
public static void main(String[] args) {
	int[] impares = new int[50];
    for (int i = 0; i < 50; i++) {
        impares[i] = i * 2 + 1;
    }
    
    System.out.println("números ímpares de 1 a 99:");
    for (int numero : impares) {
        System.out.println(numero);
    }
}
}

