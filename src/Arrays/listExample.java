package Arrays;
import java.util.ArrayList;

public class listExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        System.out.println(list);
        list.add(1,10);
        System.out.println(list);
//        System.out.println(list.get(4));
//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);
        list.remove(2);
        System.out.println(list);


    }
}
