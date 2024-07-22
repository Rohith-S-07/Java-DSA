package Arrays;

import java.util.ArrayList;

public class removeEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //remove from last index so that shifting the indexes won't affect upcoming elements
        list.add(5);
        list.add(10);
        list.add(25);
        list.add(20);
        list.add(40);
        list.add(45);
        System.out.println(list);
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
        }
        System.out.println(list);
    }
}

