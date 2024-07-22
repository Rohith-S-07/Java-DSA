package Recursion;

public class findIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 5, 6, 5, 1, 7};
        int i = 0;
        int x = 5;
        int idx = firstIndex(array, x, i);
        System.out.println(idx);
    }

    public static int firstIndex(int[] arr, int x, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == x) {
            return i;
        } else {
            int idx = firstIndex(arr, x, i + 1);
            return idx;
        }
    }
}
