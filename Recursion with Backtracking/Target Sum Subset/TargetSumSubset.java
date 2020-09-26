class TargetSumSubset{

    // 1. You are given a number n, representing the count of elements.
    // 2. You are given n numbers.
    // 3. You are given a number "tar".
    // 4. Complete the body of printTargetSumSubsets function - without changing signature - to calculate and print all subsets of given elements, the contents of which sum to "tar". 

    // Sample Input
    // 5
    // 10
    // 20
    // 30
    // 40
    // 50
    // 60

    // Sample Output
    // 10, 20, 30, .
    // 10, 50, .
    // 20, 40, .

    public static void printTargetSumSubsets(int[] arr , int idx , String set , int sos , int target){
        // set -> subset
        // sos -> sum of subset
        // target -> target value
        if(idx == arr.length){
            if(sos == target){
                System.out.println(set + ".");
            }
            return;
        }
        printTargetSumSubsets(arr , idx+1 , set + arr[idx] +", " , sos + arr[idx] , target);
        printTargetSumSubsets(arr , idx+1 , set  , sos , target);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 50;
        printTargetSumSubsets(arr , 0 , "" , 0 , target);
    }
}