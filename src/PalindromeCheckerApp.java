public class PalindromeCheckerApp {


        public static void main(String[] args) {

            String originalString = "level";

            String reversedString = "";


            for (int i = originalString.length() - 1; i >= 0; i--) {
                reversedString = reversedString + originalString.charAt(i);
            }


            System.out.println("Original String : " + originalString);
            System.out.println("Reversed String : " + reversedString);

            if (originalString.equals(reversedString)) {
                System.out.println("Result: It is a Palindrome.");
            } else {
                System.out.println("Result: It is NOT a Palindrome.");
            }

            System.out.println("Program Ended.");
        }

}
