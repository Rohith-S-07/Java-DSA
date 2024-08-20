import java.util.*;
import java.lang.*;

public class IBMq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        sc.next();
        int n = sc.nextInt();

        LinkedList<Character> list = new LinkedList<>();

        for(int i =0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }
        int k = list.size()-n;
        list.remove(k);
        System.out.println(list);
    }
}
