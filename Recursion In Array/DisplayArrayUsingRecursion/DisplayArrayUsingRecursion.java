class DisplayArrayUsingRecursion{
    public static void displayArray(int[] arr , int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        displayArray(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        displayArray(arr , 0);
    }
}