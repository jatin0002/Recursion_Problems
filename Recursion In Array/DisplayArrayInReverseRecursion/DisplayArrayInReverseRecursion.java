class DisplayArrayInReverseRecursion{
    public static void displayReverseArray(int[] arr , int i){
        if(i == 0){
            return ;
        }
        System.out.print(arr[i-1] + " ");
        displayReverseArray(arr , i-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19};
        displayReverseArray(arr , arr.length);
    }
}