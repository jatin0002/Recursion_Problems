import java.util.Scanner;


// 1. You are given a positive number n. 
// 2. You are required to print the counting from n to 1.
// 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

// Sample Output
// 5
// 4
// 3
// 2
// 1

// Sample Input
// 5



class PrintDecresing{
    public static void printDecresing(int x){
        if(x == 0){
            return;
        }
        System.out.print(x + " ");
        printDecresing(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printDecresing(x);
        sc.close();
    }
}