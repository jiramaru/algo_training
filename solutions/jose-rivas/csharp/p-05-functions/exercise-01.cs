using System;

class Program
{
    // Fonction pour additionner deux nombres
    static int Addition(int a, int b)
    {
        return a + b;
    }

    static void Main()
    {
        try
        {
            Console.Write("Entrez deux nombres : ");
            string[] valeurs = Console.ReadLine().Split();

            int a = int.Parse(valeurs[0]);
            int b = int.Parse(valeurs[1]);

            int resultat = Addition(a, b);

            Console.WriteLine("La somme est : " + resultat);
        }
        catch
        {
            Console.WriteLine("Erreur : veuillez entrer deux nombres entiers.");
        }
    }
}