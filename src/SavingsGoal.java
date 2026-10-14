import java.util.Scanner;

public class SavingsGoal {
    static void main(String[] args) {
        // Variables
        Scanner scan = new Scanner(System.in);
        double savingsGoal = 0;
        double depositAmount = 0;
        double totalSaved = 0.00;
        double excess;
        int depositCount = 0;
        boolean valid = false;

        System.out.println("What is your savings goal?");
        if (scan.hasNextDouble()) {
            savingsGoal = scan.nextDouble();

            do {
                System.out.println(totalSaved);

                if (savingsGoal > 0) {
                    System.out.println("How much do you wish to deposit?");
                    if (scan.hasNextDouble()) {
                        depositAmount = scan.nextDouble();

                        if (depositAmount > 0) {
                            totalSaved += depositAmount;
                            depositCount++;
                        }
                    }
                }

                while (savingsGoal < 1) {
                    System.out.println("That's not valid. Try again.");
                    System.out.println("What is your savings goal?");
                    if (scan.hasNextDouble()) {
                    savingsGoal = scan.nextDouble();
                    }
                }
                while (depositAmount < 1) {
                    System.out.println("That's not valid. Try again.");
                    System.out.println("How much do you wish to deposit?");
                    if (scan.hasNextDouble()) {
                        depositAmount = scan.nextDouble();
                    }
                }

                if (totalSaved < savingsGoal) {
                    System.out.println("You have entered a deposit of: $" + depositAmount);
                }

                if (totalSaved >= savingsGoal) {
                    System.out.println("\nYou have made it to or exceeded your savings goal.");
                    valid = true;
                }
            } while (!valid);
        }

        // Results
        excess = totalSaved - savingsGoal;
        System.out.print("Number of Deposits: " + depositCount);
        System.out.printf("\n%-12s%8.2f", "Total Saved: ", + totalSaved);
        System.out.printf("\n%-12s%8.2f", "Excess: ", + excess);
    }
}