
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

