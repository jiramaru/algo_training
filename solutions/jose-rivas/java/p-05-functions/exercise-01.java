import java.util.Scanner;

public class AddTwoNumbers {

    // Fonction qui additionne deux nombres
    public static int addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez deux nombres : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int resultat = addition(a, b);

            System.out.println("La somme est : " + resultat);

        } catch (Exception e) {
            System.out.println("Erreur : veuillez entrer deux nombres entiers.");
        }

        scanner.close();
    }
}