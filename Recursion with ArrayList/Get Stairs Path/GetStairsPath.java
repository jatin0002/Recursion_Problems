import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {

    // 1. You are given a number n representing number of stairs in a staircase.
    // 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
    // 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.

    // Sample Input
    // 3
    // 5

    // Sample Output
    // [111, 12, 21, 3]
    // [11111, 1112, 1121, 113, 1211, 122, 131, 2111, 212, 221, 23, 311, 32]
    
    public static ArrayList<String> getStairPaths(int n){
        if( n == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }else if( n < 0){
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();

        for(String path : path1){
            paths.add(1 + path);
        }
        for(String path : path2){
            paths.add(2 + path);
        }
        for(String path : path3){
            paths.add(3 + path);
        }

        return paths;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stairs = sc.nextInt();
        ArrayList<String> paths = getStairPaths(stairs);
        System.out.println(paths); 
    }

}
