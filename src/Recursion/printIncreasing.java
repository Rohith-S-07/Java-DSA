package Recursion;

public class printIncreasing {
    public static void main(String[] args) {
        printIncrease(10);
    }
    public static void printIncrease(int N) {
        if (N == 0)
            return;
        printIncrease(N - 1);
        System.out.print(N + " ");

    }
}
