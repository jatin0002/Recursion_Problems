import java.util.ArrayList;

public class GetKeyPadCombinations{

    // 1. You are given a string str. The string str will contains numbers only, 
    //    where each number stands for a key pressed on a mobile phone.

    // 2. The following list is the key to characters map :
    //     0 -> .;
    //     1 -> abc
    //     2 -> def
    //     3 -> ghi
    //     4 -> jkl
    //     5 -> mno
    //     6 -> pqrs
    //     7 -> tu
    //     8 -> vwx
    //     9 -> yz
     
    // 3. Complete the body of getKPC function - without changing signature
    //    to get the list of all words that could be produced by the keys in str.

    //                         0      1       2       3       4      5      6       7      8       9  
    static String[] codes = {".;" , "abc" , "def" , "ghi" , "jkl", "mno" ,"pqrs" , "tu" , "vwx" , "yz"};
    
    public static ArrayList<String> GetKPC(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char ch = str.charAt(0);
        String restOfTheString = str.substring(1);

        ArrayList<String> restResult = GetKPC(restOfTheString);
        ArrayList<String> myResult = new ArrayList<>();

        String codeForCh = codes[ch - '0'];
        for(int i = 0 ; i < codeForCh.length() ; i++){
            char chCode = codeForCh.charAt(i);
            for(String rstr : restResult ){
                myResult.add(chCode + rstr );
            }
        }

        return myResult;
    }
    public static void main(String[] args) {
        String str = "123";
        ArrayList<String> result = GetKPC(str);
        System.out.println(result);         
        System.out.println(result.size());         
    }
}
