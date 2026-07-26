import java.util.*;

public class StrBJava {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.insert(0, "e");
        System.out.println(sb);

        sb.delete(1, 4);
        System.out.println(sb);

        sb.append("C");
        System.out.println(sb);
    }    
}
