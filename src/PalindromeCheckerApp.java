import java.util.Scanner;

 class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = checkPalindrome(normalized);
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome (Ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
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