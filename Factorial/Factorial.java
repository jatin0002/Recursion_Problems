import java.util.Scanner;

// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

// Sample Input
// 5

// Sample Output
// 120

public class Factorial {
    public static long printFactorial(int x){
        if( x >= 1){
            return x * printFactorial(x-1);
        }else{
            return 1;
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long result = printFactorial(x);
        System.out.println(result);
        sc.close();
    }
}
