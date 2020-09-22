public class FirstIndexofOccurence {
    public static int FisrtIndex(int[] arr , int i , int d){
        if(i == arr.length){
            return -1;
        }
        if(d == arr[i]){
            return i;
        }else{
            int firstOccurance = FisrtIndex(arr, i+1, d);
            return firstOccurance;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,5,6,1,4,5,1,2};
        int d = 5;
        int firstOccurance = FisrtIndex(arr , 0 , d);
        System.out.println(firstOccurance);
    }
}
