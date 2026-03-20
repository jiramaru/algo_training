using System;

class Program
{
    static void Main()
    {
        try
        {
            Console.Write("Entrez le nombre d'elements : ");
            int N = int.Parse(Console.ReadLine());

            if (N < 1)
            {
                Console.WriteLine("Erreur : N doit etre >= 1");
                return;
            }

            int[] tableau = new int[N];

            Console.WriteLine("Entrez les nombres :");

            for (int i = 0; i < N; i++)
            {
                tableau[i] = int.Parse(Console.ReadLine());
            }

            int max = tableau[0];

            for (int i = 1; i < N; i++)
            {
                if (tableau[i] > max)
                {
                    max = tableau[i];
                }
            }

            Console.WriteLine("Le maximum est : " + max);
        }
        catch
        {
            Console.WriteLine("Erreur : veuillez entrer uniquement des nombres entiers.");
        }
    }
}