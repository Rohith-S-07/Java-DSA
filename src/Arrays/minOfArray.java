package Arrays;

import java.util.*;

public class minOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < N-1; i++) {
            if (arr[i] < arr[i+1])
                Min = arr[i];
        }
        System.out.println("Minimum of Array elements is "+ Min);

    }
}
