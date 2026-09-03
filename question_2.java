
//Question 2:Sum of powers
      // a=number       lets say a=2
      // p=range of power input     p=n;     
      // 2^0 + 2^1 + 2^2........... + 2^n


public class SumOfPowers {
    static int sumOfPowers(int n) {
        if (n == 0) return 1; // 2^0 = 1
        return (int)Math.pow(2, n) + sumOfPowers(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Sum of powers of 2 up to " + n + " = " + sumOfPowers(n));
    }
}
