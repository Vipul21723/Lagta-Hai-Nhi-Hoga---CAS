class Recursion {

    public static void printNum(int n) {
        System.out.print(n + " ");
        if (n+1 != 6) {
            printNum(n+1);
        }
    }

    public static int sumNaturalNum(int n) {
        // int sum = 0;

        if(n == 1) {
            return 1;
        }
        int sum = 0;
        sum = sum + n + sumNaturalNum(n-1);

        return sum;
        
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n-1);
        
    }

    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }
        
        return x*xPowerN(x, n-1);
    }

    public static void main(String[] args) {
        // printNum(1);
        // System.out.println(sumNaturalNum(5));
        // System.out.println(factorial(5));

        // int a = 0, b = 1;
        // int n = 7;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // fibonacci(a, b, n-2);

        System.out.println(xPowerN(2,5));
    }
}