//Question 3:Factorial
    //n!= n*(n-1)*(n-2)*(n-3)......1

public class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
