import java.util.Scanner;

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int N = sc.nextInt();
        
        if (N % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }