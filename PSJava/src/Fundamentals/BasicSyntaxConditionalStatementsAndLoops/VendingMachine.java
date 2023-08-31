import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("Start")) {
                break;
            }

            double money = Double.parseDouble(input);

            if (money == 0.1) {
                budget = budget + 0.1;
            } else if (money == 0.2) {
                budget = budget + 0.2;
            } else if (money == 0.5) {
                budget = budget + 0.5;
            } else if (money == 1) {
                budget = budget + 1.0;
            } else if (money == 2) {
                budget = budget + 2.0;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
        }

        while (true) {

            String input2 = scanner.nextLine();

            if (input2.equals("End")) {
                System.out.printf("Change: %.2f%n", budget);
                break;
            }


            if (input2.equals("Nuts")) {
                if (budget - 2.0 >= 0) {
                    budget = budget - 2.0;
                    System.out.printf("Purchased Nuts%n");
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }

            if (input2.equals("Water")) {
                if (budget - 0.7 >= 0) {
                    budget = budget - 0.7;
                    System.out.printf("Purchased Water%n");
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }

            if (input2.equals("Crisps")) {
                if (budget - 1.5 >= 0) {
                    budget = budget - 1.5;
                    System.out.printf("Purchased Crisps%n");
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }

            if (input2.equals("Soda")) {
                if (budget - 0.8 >= 0) {
                    budget = budget - 0.8;
                    System.out.printf("Purchased Soda%n");
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }

            if (input2.equals("Coke")) {
                if (budget - 1 >= 0) {
                    budget = budget - 1.0;
                    System.out.printf("Purchased Coke%n");
                } else {
                    System.out.printf("Sorry, not enough money%n");
                }
            }

            if (input2.equals("Coke") || input2.equals("Soda") || input2.equals("Crisps") || input2.equals("Water") || input2.equals("Nuts") || input2.equals("End")) {
            } else {
                System.out.printf("Invalid product%n");
            }

        }
    }
}
