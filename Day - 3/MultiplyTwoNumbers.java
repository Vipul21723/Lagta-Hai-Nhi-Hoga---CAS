import java.util.*;

public class MultiplyTwoNumbers {
    
    public static int multiplyTwoNumbers(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = multiplyTwoNumbers(a, b);
        System.out.println(result);
    }
}
