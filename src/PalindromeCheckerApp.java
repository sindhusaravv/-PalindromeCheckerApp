import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
 System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < cleanedInput.length(); i++) {
            char ch = cleanedInput.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
}