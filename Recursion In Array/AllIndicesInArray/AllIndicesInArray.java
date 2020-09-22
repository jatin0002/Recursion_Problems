import java.util.Arrays;

public class AllIndicesInArray {
    public  static int[] IndicesArray(int[] arr , int i , int d , int frecuencyCount){
        // here frecuencyCount helps to create resultant array 
        if(i == arr.length){
            return new int[frecuencyCount];
        }
        if(arr[i] == d){
            int[] iarr = IndicesArray(arr, i+1, d, frecuencyCount+1);
            iarr[frecuencyCount] = i;
            return iarr;
        }else{
            int[] iarr = IndicesArray(arr, i+1, d, frecuencyCount);
            return iarr;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2,3};
        int d = 3;
        int[] indicesArray = IndicesArray(arr , 0 , d , 0);
        System.out.println(Arrays.toString(indicesArray));
    }
}
