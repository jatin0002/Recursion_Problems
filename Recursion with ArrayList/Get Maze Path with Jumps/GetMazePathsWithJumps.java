import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {
    
    // 1. You are given a number n and a number m representing number of rows and columns in a maze.
    // 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
    // 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ),
    //    or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
    // 4. Complete the body of getMazePath function - without changing signature -
    //    to get the list of all paths that can be used to move from top-left to bottom-right.

    // Sample Input
    // 2
    // 2

    // 3
    // 3

    // Sample Output
    // [h1v1, v1h1, d1]
    
    // [h1h1v1v1, h1h1v2, h1v1h1v1, h1v1v1h1, h1v1d1, h1v2h1, h1d1v1, h2v1v1, h2v2, v1h1h1v1, v1h1v1h1, v1h1d1, v1h2v1, v1v1h1h1, v1v1h2, v1d1h1, v2h1h1, v2h2, d1h1v1, d1v1h1, d1d1, d2]

    public static ArrayList<String> getMazePath(int sr, int sc, int dr , int dc){

         if(sc == dc && sr == dr){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        } 
        ArrayList<String> paths = new ArrayList<>();

         // For Horizontal jumps
         for(int ms=1 ; ms<= dc-sc ; ms++){
            ArrayList<String> hPaths = getMazePath(sr, sc+ms, dr, dc);
            for(String hpath : hPaths){
                paths.add("h" + ms + hpath);
            }
         }

         // For Vertical jumps
         for(int ms=1 ; ms<= dr-sr ; ms++){
            ArrayList<String> vPaths = getMazePath(sr+ms, sc, dr, dc);
            for(String vpath : vPaths){
                paths.add("v" + ms + vpath);
            }
         }

         // For Horizontal jumps
         for(int ms=1 ; ms<= dc-sc && ms<= dr-sr ; ms++){
            ArrayList<String> dPaths = getMazePath(sr+ms, sc+ms, dr, dc);
            for(String dpath : dPaths){
                paths.add("d" + ms + dpath);
            }
         }
         return paths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> result = getMazePath(1 , 1 , n ,m);
        System.out.println(result);
    }
}
