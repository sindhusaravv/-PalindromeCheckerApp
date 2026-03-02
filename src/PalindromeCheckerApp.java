import java.util.Scanner;

public class UseCase8PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        if (cleanedInput.length() == 0) {
            System.out.println("Empty string is a Palindrome.");
            scanner.close();
            return;
        }
        Node head = new Node(cleanedInput.charAt(0));
        Node current = head;
        for (int i = 1; i < cleanedInput.length(); i++) {
            current.next = new Node(cleanedInput.charAt(i));
            current = current.next;
        }
        boolean isPalindrome = checkPalindrome(head);
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
    public static boolean checkPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}