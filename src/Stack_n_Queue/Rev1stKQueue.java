package Stack_n_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Rev1stKQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        reverse(queue, 3);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            stack.push(queue.remove());
        }
        for (int i =0; i<k; i++){
            queue.offer(stack.pop());
        }
        int count = queue.size()-k;
        for(int i = 0; i<count; i++){
            queue.offer(queue.poll());
        }
    }


}
