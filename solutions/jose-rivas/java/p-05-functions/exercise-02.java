public class Factorial {

    // Fonction qui calcule le factoriel d'un nombre
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int resultat = fact(5);
        System.out.println(resultat);
    }
}