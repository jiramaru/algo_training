using System;

class Program
{
    static void Main()
    {
        try
        {
            Console.Write("Entrez un nombre N : ");
            int N = int.Parse(Console.ReadLine());

            if (N < 1)
            {
                Console.WriteLine("Erreur : N doit etre >= 1");
                return;
            }

            int somme = 0;

            for (int i = 1; i <= N; i++)
            {
                somme = somme + i;
            }

            Console.WriteLine("La somme de 1 a " + N + " est : " + somme);
        }
        catch
        {
            Console.WriteLine("Erreur : veuillez entrer un nombre entier.");
        }
    }
}