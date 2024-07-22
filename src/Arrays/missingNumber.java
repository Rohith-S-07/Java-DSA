package Arrays;
import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalSum=0;
        int indexSum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            int num = sc.nextInt();
            totalSum+=num;
            indexSum+=i;
        }
        System.out.println((indexSum+n)-totalSum);
    }
}
