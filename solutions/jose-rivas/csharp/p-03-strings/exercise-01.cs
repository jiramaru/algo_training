using System;

class Program
{
    static void Main()
    {
        try
        {
            Console.Write("Entrez une chaine : ");
            string texte = Console.ReadLine();

            if (texte.Length < 1)
            {
                Console.WriteLine("Erreur : la chaine doit contenir au moins un caractere.");
                return;
            }

            string resultat = "";

            for (int i = texte.Length - 1; i >= 0; i--)
            {
                resultat = resultat + texte[i];
            }

            Console.WriteLine("Chaine inversee : " + resultat);
        }
        catch
        {
            Console.WriteLine("Erreur lors de la lecture de la chaine.");
        }
    }
}