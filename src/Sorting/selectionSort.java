package Sorting;

public class selectionSort {
    public static void main(String[] args) {

        int[] array = {3, 5, 1, 7, 23, 18, 23};
        for (int i = 0; i < array.length - 1; i++) {
            int minval = array[i];
            int minidx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minval) {
                    minidx = j;
                    minval = array[j];
                }
            }
            int temp = array[i];
            array[i] = array[minidx];
            array[minidx] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
