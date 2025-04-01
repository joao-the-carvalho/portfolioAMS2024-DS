public class Ex7 {
    public static void main(String[] args) {
       
        char[][] m1 = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = '*';
            }
        }
        System.out.println("Matriz 4x4 com padrão de quadrado:");
        for (char[] linha : m1) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();

        
        char[][] m2 = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    m2[i][j] = '*';
                } else {
                    m2[i][j] = ' ';
                }
            }
        }
        System.out.println("Matriz 4x4 com padrão de quadrado apenas com a borda:");
        for (char[] linha : m2) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();


        char[][] m3 = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j <= i) {
                    m3[i][j] = '*';
                } else {
                    m3[i][j] = ' ';
                }
            }
        }
        System.out.println("Matriz 4x4 com padrão de escada:");
        for (char[] linha : m3) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}