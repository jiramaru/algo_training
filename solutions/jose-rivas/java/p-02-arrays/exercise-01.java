import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le nombre d'elements : ");
            int N = scanner.nextInt();

            if (N < 1) {
                System.out.println("Erreur : N doit etre >= 1");
                return;
            }

            int[] tableau = new int[N];

            System.out.println("Entrez les nombres :");

            for (int i = 0; i < N; i++) {
                tableau[i] = scanner.nextInt();
            }

            int max = tableau[0];

            for (int i = 1; i < N; i++) {
                if (tableau[i] > max) {
                    max = tableau[i];
                }
            }

            System.out.println("Le maximum est : " + max);

        } catch (Exception e) {
            System.out.println("Erreur : veuillez entrer uniquement des nombres entiers.");
        }

        scanner.close();
    }
}