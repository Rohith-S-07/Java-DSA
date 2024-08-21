package Trees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TREE {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        Node() {
        }
    }


    public static void main(String[] args) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data to add nodes to the Tree(Enter any Non-Integer to quit): ");
        while (true) {
            try {
                int data = sc.nextInt();
                root = Insert(root, data);
            } catch (InputMismatchException e) {
                System.out.println("Non - Integer input Detected");
                break;
            }
        }


        Inorder(root);
        System.out.println();
        System.out.println("The size of the Tree is: " + Size(root));
        System.out.println("The Sum of nodes on the Tree is: " + Sum(root));
        System.out.println("The Max Node of the Tree is: " + Max(root));
        System.out.println("The Min Node of the Tree is: " + Min(root));
        System.out.println("The Height of the Tree is:" + Height(root));
    }

    public static void Inorder(Node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static int Size(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = Size(root.left);
        int rightCount = Size(root.right);
        return leftCount + rightCount + 1;
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int Max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = Max(root.left);
        int rightMax = Max(root.right);
        return (Math.max(Math.max(leftMax, rightMax), root.data));
    }

    public static int Min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMax = Min(root.left);
        int rightMax = Min(root.right);
        return (Math.min(Math.min(leftMax, rightMax), root.data));
    }

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static Node Insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = Insert(root.left, data);
        } else {
            root.right = Insert(root.right, data);
        }
        return root;
    }
}
