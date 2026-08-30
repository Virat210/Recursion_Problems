//Check whether string is pallindrome or not.

public class PCheck {
    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "mom";
        System.out.println(str + " is palindrome? " + isPalindrome(str, 0, str.length() - 1));
    }
}
