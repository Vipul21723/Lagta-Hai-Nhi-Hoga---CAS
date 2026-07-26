// package Day - 3;

import java.util.*;

public class QUIZ {

    public static int averageQ1(int a, int b, int c) {
        return ((a + b + c)/3);
    }

    public static int sumOfOddNumbersQ2(int n) {
        int sum = 0;
        for(int i=1; i<=n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int greaterNumberQ3(int a, int b) {
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }

    public static double circumferenceOfCircleQ4(double r) {
        return (3.14*(r*r));
    }

    public static void voteAgeQ5(int age) {
        if(age > 18) {
            System.out.println("Eligible To VOTE");
        } else{
            System.out.println("Not Eligible To VOTE");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int z = sc.nextInt();
        
        // System.out.println(averageQ1(x, y, z));
        
        // int n = sc.nextInt();

        // System.out.println(sumOfOddNumbersQ2(n));

        // int x = sc.nextInt();
        // int y = sc.nextInt();
        
        // System.out.println(greaterNumberQ3(x, y));
       
        // double r = sc.nextDouble();
        // System.out.println(circumferenceOfCircleQ4(r));

        // int age = sc.nextInt();
        // voteAgeQ5(age);

        // do{
        //     System.out.println("INFINITE");
        // } while(true);

        // boolean stop = false;

        // int positive = 0;
        // int negative = 0;
        // int zeros = 0;
        
        // do {

        //     int n = sc.nextInt();

        //     if(n>0) {positive++;}
        //     else if(n<0) {negative++;}
        //     else {zeros++;}

        //     System.out.print("Do you Want to enter other : (Y/N) ");

        //     String choice[] = sc.nextLine()();

        //     if(choice == "N" || choice == "n") {
        //         stop = true;
        //         // exit(0);
        //     }

        // } while(stop == false);

        // System.out.println("Positive : " + positive);
        // System.out.println("Negative : " + negative);
        // System.out.println("Zeros    : " + zeros);


    }
}
