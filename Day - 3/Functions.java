// package Day - 3;

import java.util.*;

public class Functions {
    
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName("Vipul");
        printMyName(name);
    }
}
