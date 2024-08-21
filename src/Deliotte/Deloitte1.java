package Deliotte;

import java.util.*;

public class Deloitte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findNthLargest(arr, s, n));
    }

    public static int findNthLargest(int[] arr, int s, int n) {
        int result = 0;

        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        List<Integer> list = new ArrayList<>();

        for(int y: set){
            list.add(y);
        }


        return list.get(list.size() - n);
    }
}
