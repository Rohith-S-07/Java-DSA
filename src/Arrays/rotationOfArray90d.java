package Arrays;

import java.util.Scanner;

public class rotationOfArray90d {

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

            int[][] rotated = new int[col][row];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    rotated[j][row - 1 - i] = arr[i][j];
                }
            }


            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++)
                    System.out.print(rotated[i][j] + " ");
                System.out.println();
            }

        }
}
