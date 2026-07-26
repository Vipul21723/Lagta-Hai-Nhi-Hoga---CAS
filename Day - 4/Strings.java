import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String name = "MS";
        // String fullName = "MSD";
        // String sentence = "I am MSD";

        Scanner sc = new Scanner(System.in);

        // String name = sc.next();
        // String name = sc.nextLine();

        // System.out.println("Name : " + name);

        // Concatenation

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // System.out.println(fullName.charAt(0));

        // for(int i =0; i<fullName.length(); i++) {
        //     System.out.print(fullName.charAt(i) + ", ");
        // }

        // String name1 = "Tony";
        // String name2 = "TOny";

        // // System.out.println(name1.compareTo(name2));

        // if (name1.compareTo(name2) == 0) {
        //     System.out.println("Both are equal");
        // } else{
        //     System.out.println("Both are different");
        // }


        String str = "Indian Army is the one of the powerfull army on this planet";

        System.out.println(str.substring(0, 5));
    }    
}
