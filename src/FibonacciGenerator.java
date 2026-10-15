import java.util.Scanner;

public class FibonacciGenerator {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        int term1 = 0;
        int term2 = 1;
        int terms = 0;
        int newTerm;
        boolean valid = false;

        do {
            System.out.println("How many terms do you want in your Fibonacci Sequence?");
            if (!scan.hasNextInt()) {
                System.out.println("That's not a valid input. Numbers only. Try again.");
                scan.next();
            } else {
                terms = scan.nextInt();
                if (terms < 1){
                    System.out.println("That's not a valid input. Enter a positive integer. Try again.");
                } else if (terms > 47) {
                    System.out.println("That's above the integer limit of java. It must by below 48. Try again.");
                } else {
                    valid = true;
                }
            }
        } while (!valid);

        for (int i = 0; i < terms; i++){
            if (term1 != 0) {
                System.out.print(", " + term1);
            } else {
                System.out.print("Your sequence of " + terms + " is: " + term1);
            }

            newTerm = term1 + term2;
            term1 = term2;
            term2 = newTerm;
        }
    }
}