import java.util.Scanner;

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindrome(normalized);
    }
    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();
        boolean result = checker.checkPalindrome(input);
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
}