package hw3palindrome;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("аргентинаманитнегра"));
    }

    public static boolean checkPalindrome(String s) {
        boolean result = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                result = false;
                break;
            }
        }
        return result;}
}
