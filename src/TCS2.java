import java.util.*;

public class TCS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        String[] strArray = str.split(" ");
        int count = 0, current = 0, next = 0, diff = 0;
        for (int i = 0; i < strArray.length - 1; i++) {
            current = Integer.parseInt(strArray[i].toString());
            next = Integer.parseInt(strArray[i + 1].toString());
            diff = Math.abs(current-next);
            if (diff==k)
                count++;
        }
        System.out.println(count);
    }
}
