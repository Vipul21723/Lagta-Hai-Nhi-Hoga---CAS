import java.util.*;

public class Array2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers Of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Numbers Of Columns : ");
        int column = sc.nextInt();

        int[][] nums = new int[row][column];

        System.out.println("Enter The Elements of 2D array : ");

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                // System.out.printf("Enter nums[%d][%d] : ", i, j);
                nums[i][j] = sc.nextInt();
            }
            // System.out.println();
        }

        System.out.println("Your 2D array : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                // System.out.printf("Enter nums[%d][%d] : ", i, j);
                // nums[i][j] = sc.nextInt();
                System.out.printf("%2d ", nums[i][j]);
            }
            System.out.println();
        }

    }
}