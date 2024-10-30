import java.util.Arrays;
public class Ex1 {
	public static void main(String[] args) {
		String[] nomes = {"João", "Beatriz", "Nicollas", "Tauane", "Mauro", "Wellington", "Raviel", "Jonathan", "Caio", "Lebron"};
		Arrays.sort(nomes);
		
		System.out.println("Nomes em ordem crescente: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
