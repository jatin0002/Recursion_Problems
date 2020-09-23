import java.util.ArrayList;

public class Subsequence {
    // 1. You are given a string str.
    // 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
    // Use sample input and output to take idea about subsequences.

    // Sample Input
    // abc

    // Sample Output
    // [, c, b, bc, a, ac, ab, abc]

    public static ArrayList<String> getSubSequence(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String restOfTheString = str.substring(1);
        ArrayList<String> result = getSubSequence(restOfTheString);

        ArrayList<String> myResult = new ArrayList<>();
        for(String rstr : result){
            myResult.add("" + rstr);
        }
        for(String rstr : result){
            myResult.add(ch + rstr);
        }
        return myResult;
    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = getSubSequence(str);
         System.out.print(result);
    }
    
}
