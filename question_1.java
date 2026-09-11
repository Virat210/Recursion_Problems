//Question 1: Sum of squares of numbers
         // 1^2 + 2^2 + 3^2.................... + n^2


public class SumOfSquares {
    static int sumOfSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Sum of squares up to " + n + " = " + sumOfSquares(n));
    }
}
