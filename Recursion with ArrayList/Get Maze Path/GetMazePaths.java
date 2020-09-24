import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    
    // 1. You are given a number n and a number m representing number of rows and columns in a maze.
    // 2. You are standing in the top-left corner and have to reach the bottom-right corner.
    //    Only two moves are allowed 'h' (1-step) and 'v' (1-step vertical).
    // 3. Complete the body of getMazePath function - without changing signature -
    //    to get the list of all paths that can be used to move from top-left to bottom-right.

    // Sample Input
    //  3
    //  3

    // Sample Output
    // [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
    
    // sc -> source row
    // sr -> source column
    // dc -> destinatin row
    // dr -> destinatin column
    public static ArrayList<String> getMazePath(int sr , int sc , int dc, int dr){
        if(sc == dc && sr == dr){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        
        if(sc < dc){
            hPaths = getMazePath(sr, sc+1, dc, dr);
        }
        if(sr < dr){
            vPaths = getMazePath(sr+1 , sc, dc, dr);
        }
        
        ArrayList<String> paths = new ArrayList<>();

        for(String hPath : hPaths){
            paths.add("h" + hPath);
        }
        for(String vPath : vPaths){
            paths.add("v" + vPath);
        }

        return paths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> result = getMazePath(1, 1,n,m);
        System.out.println(result);
    }
}
