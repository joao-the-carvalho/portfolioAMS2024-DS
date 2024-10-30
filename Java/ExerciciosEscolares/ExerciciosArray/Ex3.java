import java.util.Arrays;
public class Ex3 {
public static void main(String[] args) {
	 int[] numeros = {5, 3, 8, 1, 4, 9, 2, 6, 7, 69, 15, 12, 10, 18, 16, 14, 11, 13, 19, 17,
             25, 22, 20, 28, 26, 23, 21, 27, 30, 29, 35, 33, 31, 32, 36, 34, 38, 37, 39, 40, 41, 47, 46, 44, 45, 49, 50, 48, 52, 53, 54, 55, 56, 57};
Arrays.sort(numeros);

System.out.println("numeros em ordem crescente: ");
for (int numero : numeros) {
System.out.println(numero);
}
}
}
