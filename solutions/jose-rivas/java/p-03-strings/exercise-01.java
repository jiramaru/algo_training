import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez une chaine : ");
            String texte = scanner.nextLine();

            if (texte.length() < 1) {
                System.out.println("Erreur : la chaine doit contenir au moins un caractere.");
                return;
            }

            String resultat = "";

            for (int i = texte.length() - 1; i >= 0; i--) {
                resultat = resultat + texte.charAt(i);
            }

            System.out.println("Chaine inversee : " + resultat);

        } catch (Exception e) {
            System.out.println("Erreur lors de la lecture de la chaine.");
        }

        scanner.close();
    }
}