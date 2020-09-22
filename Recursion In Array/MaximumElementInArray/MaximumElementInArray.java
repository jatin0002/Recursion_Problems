public class MaximumElementInArray {

  

    public static int MaxElementInArray(int[] arr , int i){
        
        if(i == arr.length - 1){
            return arr[i];
        }
        int maxElement = MaxElementInArray(arr, i+1);
        if(maxElement > arr[i]){
            return maxElement;
        }else{
            return arr[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {12 ,45,56,23,112,45};
        int maxEle = MaxElementInArray(arr , 0);
        System.out.println(maxEle);
    }
}
