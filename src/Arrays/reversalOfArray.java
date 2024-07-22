package Arrays;

import java.util.*;

public class reversalOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        int i = 0;
        int j = N - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse of Array elements is ");
        for (int k =0; k<N ; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
