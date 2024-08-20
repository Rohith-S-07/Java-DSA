package Stack_n_Queue;

import java.util.LinkedList;

public class StackLL {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        stack.addFirst(4);
        stack.addFirst(5);

        System.out.println(stack.removeFirst());
    }
}
