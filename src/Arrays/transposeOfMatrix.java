package Arrays;

import java.util.*;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

//                if (j < i) {
//                    int temp = arr[i][j];
//                    arr[i][j] = arr[j][i];
//                    arr[j][i] = temp;
//                }

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();

        }

    }
}
