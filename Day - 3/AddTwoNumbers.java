// package Day - 3;

import java.util.*;

public class AddTwoNumbers {
    
    public static int addTwoNumbers(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = addTwoNumbers(a, b);
        System.out.println(result);
    }
}
