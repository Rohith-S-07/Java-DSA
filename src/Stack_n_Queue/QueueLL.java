package Stack_n_Queue;

import java.util.LinkedList;

public class QueueLL {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.addLast(5);
        System.out.println(queue.removeFirst());
    }
}
