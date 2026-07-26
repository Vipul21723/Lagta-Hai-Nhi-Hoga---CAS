import java.util.*;

public class Q1Array2D {

    public static int[] searchElement(int[][] nums, int x) {
        int[] pair = {-1,-1};

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    pair[0] = i;
                    pair[1] = j;
                }
            }
        }

        return pair;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers Of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Numbers Of Columns : ");
        int column = sc.nextInt();

        int[][] nums = new int[row][column];

        System.out.println("Enter Elements Of Nums Array : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements Of Nums Array : ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter Element To Search : ");
        int x = sc.nextInt();

        int[] pair = searchElement(nums, x);
        
        if(pair[0] != -1) {
            System.out.println(x + " is available at [" + pair[0] + "," + pair[1] + "]");
        } else {
            System.out.println(x + " isn't available");
        }

    }
}
