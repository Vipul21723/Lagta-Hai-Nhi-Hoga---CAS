import java.util.*;

public class QRverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        
        // String[] rstr = new String[str.length()];

        String rstr = "";

        for(int i=str.length()-1; i>=0; i--) {
            rstr += str.charAt(i);
        }

        System.out.println(rstr);

    }
}
