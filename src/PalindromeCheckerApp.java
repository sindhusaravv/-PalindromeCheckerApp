<<<<<<< HEAD
public class PalindromeCheckerApp {


        public static void main(String[] args) {

            String input = "radar";

            char[] characters = input.toCharArray();

            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            while (start < end) {
                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            System.out.println("Input String: " + input);

            if (isPalindrome) {
                System.out.println("Result: It is a Palindrome.");
            } else {
                System.out.println("Result: It is NOT a Palindrome.");
            }

            System.out.println("Program Ended.");
        }

}
=======

import java.util.Scanner;
import java.util.Stack;

     class UseCase5PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Stack<Character> stack = new Stack<>();
            System.out.println("Enter a string to check palindrome:");
            String input = scanner.nextLine();

            String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

            for (int i = 0; i < cleanedInput.length(); i++) {
                stack.push(cleanedInput.charAt(i));
            }
            String reversed = "";
            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            if (cleanedInput.equals(reversed)) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }

>>>>>>> 96dacb8 (UC5: stack based check)
