import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez un nombre N : ");
            int N = scanner.nextInt();

            if (N < 1) {
                System.out.println("Erreur : N doit etre >= 1");
                return;
            }

            int somme = 0;

            for (int i = 1; i <= N; i++) {
                somme = somme + i;
            }

            System.out.println("La somme de 1 a " + N + " est : " + somme);

        } catch (Exception e) {
            System.out.println("Erreur : veuillez entrer un nombre entier.");
        }

        scanner.close();
    }
}