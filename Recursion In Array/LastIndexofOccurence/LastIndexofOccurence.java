public class LastIndexofOccurence {
    public static int LastIndex(int[] arr ,int  i ,int  d){
        if(i == 0){
            return -1;
        }

        if(d == arr[i-1]){
            return i-1;
        }
        else{
            int lastOccurance = LastIndex( arr, i-1 , d);
            return lastOccurance;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8};
        int d = 1;
        int lastOccurance = LastIndex(arr , arr.length , d);
        System.out.println(arr[lastOccurance]);
        System.out.println(lastOccurance);
    }
}
