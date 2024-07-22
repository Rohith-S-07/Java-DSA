package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 7, 23, 18, 23};
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j]>key) {
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = key;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
