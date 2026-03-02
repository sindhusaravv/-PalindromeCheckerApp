import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();
        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < cleanedInput.length(); i++) {
            deque.addLast(cleanedInput.charAt(i));
        }
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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