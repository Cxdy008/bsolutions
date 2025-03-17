import java.util.Scanner;

public class Justifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCount = 0;

        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o N

        if(N!= 0){
            String[] words = new String[N];
            int maxLength = 0;

            // Ler palavras e determinar o comprimento máximo
            for (int i = 0; i < N; i++) {
                words[i] = scanner.nextLine().trim();
                if (words[i].length() > maxLength) {
                    maxLength = words[i].length();
                }
            }

            // Imprimir com formatação
            if (caseCount++ > 0) System.out.println(); // Linha em branco entre casos
            for (String word : words) {
                System.out.printf("%" + maxLength + "s%n", word);
            }
        } else {
            return;
        }

        scanner.close();
    }
}