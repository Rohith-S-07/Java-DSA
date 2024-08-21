package Deliotte;
import java.util.*;

public class Deloitte2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();
        char ch = str.charAt(0);
        for (int i =0; i<m; i++){
            System.out.print(ch + " ");
            ch+=n;

        }
    }
}
