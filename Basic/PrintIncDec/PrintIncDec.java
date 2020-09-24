import java.util.Scanner;

// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1 and back to n again.
// 3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.

// Sample Input
// 5

// Sample Output
// 3
// 2
// 1
// 1
// 2
// 3


public class PrintIncDec {
    public static void  printIncDec(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printIncDec(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printIncDec(x);
        sc.close();
    }
}
