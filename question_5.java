//Question 5 :TO calculate max and min of an array. 


public class ArrayMaxMin {
    static int findMax(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    static int findMin(int[] arr, int n) {
        if (n == 1) return arr[0];
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 7};
        int n = arr.length;
        System.out.println("Max element = " + findMax(arr, n));
        System.out.println("Min element = " + findMin(arr, n));
    }
}
