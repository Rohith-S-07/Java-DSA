package Recursion;

public class printArray {
    public static void main(String... args){
        int[] array = {1,2,3,4,5,6,7};
        int i = 0;
        printArray(array,i);
    }

    public static void printArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }
}
