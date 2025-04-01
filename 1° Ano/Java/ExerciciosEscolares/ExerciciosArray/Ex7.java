
public class Ex7 {
public static void main(String[] args) {
	String[] times = {"Botafogo", "Palmeiras", "Fortaleza", "Flamengo", "Internacional", "São Paulo", "Bahia", 
            "Cruzeiro", "Vasco da Gama", "Atlético-MG", "Grêmio", "Criciúma", "Fluminense", "Vitória (🔥)", 
            "Corinthians (🔥)", "Athletico-PR", "Bragantino", "Juventude", "Cuiabá", "Atlético-GO"};

System.out.println("Classificação do Campeonato Brasileiro na temporada de 2024:");
for (int i = 0; i < times.length; i++) {
System.out.printf("%d. %s%n", i + 1, times[i]);
}
}
}
