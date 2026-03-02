import java.util.*;

 class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to test performance:");
        String input = scanner.nextLine();
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(normalized);
        long endStack = System.nanoTime();

        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(normalized);
        long endDeque = System.nanoTime();

        long startRecursive = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(normalized, 0, normalized.length() - 1);
        long endRecursive = System.nanoTime();
        System.out.println("\n--- Performance Results ---");
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Stack Execution Time: " + (endStack - startStack) + " ns\n");

        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + (endDeque - startDeque) + " ns\n");

        System.out.println("Recursive Strategy Result: " + recursiveResult);
        System.out.println("Recursive Execution Time: " + (endRecursive - startRecursive) + " ns\n");

        scanner.close();
    }

    public static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequePalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static boolean recursivePalindrome(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;

        return recursivePalindrome(str, left + 1, right - 1);
    }
}