using System;

class Factorial
{
    static void Main(string[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int N = sc.nextInt();

        System.out.println("Factorial of " + N + " is " + factorial(N));
    }

    static int factorial(int N)
    {
        if (N == 1)
        {
            return 1;
        }
        else
        {
            return N * factorial(N - 1);
        }
    }
}