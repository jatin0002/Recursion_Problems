import java.util.Scanner;

// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .


// Sample Input
// 2
// 5

// Sample Output
// 32

public class Power {
    public static long printPower(int b , int p){
        if(p == 0){
            return 1;
        }
        long baseToThePowerNMinus1 = printPower(b, p - 1);
        long baseToThePowerN = b * baseToThePowerNMinus1;
        return baseToThePowerN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();

        long result = printPower(base , power);
        System.out.println(result);
        sc.close();
    }
}
