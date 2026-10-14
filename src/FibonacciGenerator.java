import java.util.Scanner;

public class FibonacciGenerator {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        int term1 = 0;
        int term2 = 1;
        int terms;

        System.out.println("How many terms do you want in your Fibonacci Sequence?");
        terms = scan.nextInt();

        for (int i = 0; i < terms; i++){
            System.out.println(term1);
            System.out.println(term2);

            term1 += term2;
            term2 += term1;
        }
    }
}