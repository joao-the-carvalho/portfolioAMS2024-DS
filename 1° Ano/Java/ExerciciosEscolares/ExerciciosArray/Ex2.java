import java.util.Arrays;
import java.util.Collections;
public class Ex2 {
	public static void main(String[] args) {
		String[] nomes = {"João", "Julio", "Lucas", "Nicollas", "Lukas", "Matheus", "Beatriz", "Mauro", "Marcelo", "Raviel", "Jonathan", "Caio", "Agnaldo", "Wellington", "Ziraldo", "Cesar", "Kevin", "Wallex", "Giovanna", "Mariana"};
	Arrays.sort(nomes, Collections.reverseOrder());
	
	System.out.println("Nomes em ordem decrescente: ");
	for (String nome : nomes) {
		System.out.println(nome);
	}
	}
}
