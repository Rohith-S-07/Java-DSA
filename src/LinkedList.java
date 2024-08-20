public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node newNode = new Node(11);
        Node head = newNode;
        head = addLast(head, 12);
//        head = addLast(head, 13);
//        head = addLast(head, 14);
//        head = addLast(head, 15);
//        head = addLast(head, 16);
//        head = addFirst(head, 20);
//        head = addLast(head, 16);
//        head = addAtIndex(head, 122, 2);
//        head = replaceValue(head,17,7);
//        head = removeFirst(head);
//        head =  removeLast(head);
//        head= removeAtIndex(head,2);
        printList(head);
//        findIndex(head, 18);
        findMiddle(head);
    }


    public static int printList(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        return 0;
    }

    public static Node addFirst(Node head, int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        return head;
    }

    public static Node addLast(Node head, int val) {
        Node n = new Node(val);
        if (head == null) {
            return addFirst(head, val);
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = n;
        return head;
    }

    public static Node addAtIndex(Node head, int val, int idx) {
        if (head == null) {
            return addFirst(head, val);
        }
        if (idx == 0) {
            return addFirst(head, val);
        }
        Node n = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        Node tempP1 = temp.next;
        temp.next = n;
        n.next = tempP1;
        return head;
    }

    public static Node replaceValue(Node head, int replace, int replaceWith) {
        if (head == null) {
            return addFirst(head, replaceWith);
        }
        Node temp = head;
        boolean replaced = false;
        while (temp != null) {
            if (temp.data == replace) {
                temp.data = replaceWith;
                replaced = true;
                break;
            }
            temp = temp.next;
        }
        if (!replaced) {
            head = addLast(head, replaceWith);
            System.out.println("Element Not found");
        }
        return head;
    }

    public static Node removeFirst(Node head) {
        if (head == null) {
            System.out.println("LL does not contain an element");
            return head;
        }
        if (head.next == null) {
            System.out.println("LL have only one element");
            return null;
        }
        head = head.next;
        return head;
    }

    public static Node removeLast(Node head) {
        if (head == null) {
            System.out.println("LL does not contain an element");
            return null;
        }
        if (head.next == null) {
            System.out.println("LL have only one element");
            return null;
        }
        Node tail = head;

        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;

        return head;
    }

    public static Node removeAtIndex(Node head, int idx) {
        if (head == null) {
            System.out.println("LL doesn't contain eny element");
            return null;
        }
        if (idx == 0) {
            removeFirst(head);
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp.next == null || temp.next.next == null) {
                System.out.println("Index out of bounds");
                return head;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void findIndex(Node head, int val) {
        if (head == null) {
            System.out.println("LL is Empty, value Not found");
        }
        Node temp = head;
        boolean found = false;
        int idx = 0;
        while (temp != null) {
            idx++;
            if (temp.data == val) {
                System.out.println("Element found at " + idx);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Element Not found");
        }
    }

    public static void findMiddle(Node head) {

        if(head==null){
            System.out.println("LL is Empty");
        }

        Node small = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            small = small.next;
        }

        System.out.println("Middle Element is: " + small.data);
    }
}
