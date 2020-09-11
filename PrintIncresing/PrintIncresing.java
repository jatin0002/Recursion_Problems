import java.util.Scanner;

// 1. You are given a positive number n. 
// 2. You are required to print the counting from 1 to n.
// 3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

// Sample Input
// 5

// Sample Output
// 1
// 2
// 3
// 4
// 5


class PrintIncresing{
    public static void  printDecresing(int n){
        if(n == 0){
            return;
        }
        printDecresing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printDecresing(x);
        sc.close();
    }
}