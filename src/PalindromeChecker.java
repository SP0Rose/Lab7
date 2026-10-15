import java.util.Scanner;

public class PalindromeChecker {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        String userString;
        String newString = "";

        System.out.println("Enter a string.");
        userString = scan.nextLine();

        for (int i = userString.length(); i > 0; i--){
            String currentChar = userString.substring(i - 1, i);
            newString += currentChar;
        }

        if (newString.equalsIgnoreCase(userString)){
            System.out.println("That is a palindrome.");
        } else {
            System.out.println("That is not a palindrome.");
        }
    }
}