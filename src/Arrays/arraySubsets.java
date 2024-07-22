package Arrays;

import java.util.*;

public class arraySubsets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        System.out.println("Subsets of Array are");
        for (int si = 0; si < N; si++) {
            for (int ei = si; ei < N; ei++) {
                for (int k = si; k <= ei; k++)
                    System.out.print(arr[k]+"");
                System.out.println();
            }
        }

    }
}
