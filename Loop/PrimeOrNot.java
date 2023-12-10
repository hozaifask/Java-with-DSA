// import java.util.*;
// public class Primeornot {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         for( int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//     }
// }



import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();

        // Check if the number is prime and print the result
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        // Close the Scanner
        sc.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check for factors up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by i, it's not a prime number
            }
        }

        // If no factors are found, n is a prime number
        return true;
    }
}
