import java.util.Scanner;

public class dateFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int D = sc.nextInt();
        int fine = sc.nextInt();

        boolean isEven = false;
        if (D % 2 == 0)
            isEven = true;

        int totalFine = 1;
        if (!isEven) {
            if (evenCount == 0)
                System.out.println("0");
            else {
                totalFine = evenCount * fine;
                System.out.println(totalFine);
            }
        } else {
            if (oddCount == 0)
                System.out.println("0");
            else {
                totalFine = oddCount * fine;
                System.out.println(totalFine);
            }
        }
    }
}
