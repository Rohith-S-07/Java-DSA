package Arrays;

import java.util.*;

public class maxOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > Max)
                Max = arr[i];
        }
        System.out.println("Maximum of Array elements is "+Max);

    }
}
