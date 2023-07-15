import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double Balanceleft = currentBalance;

        String game1 = "OutFall 4";
        String game2 = "CS: OG";
        String game3 = "Zplinter Zell";
        String game4 = "Honored 2";
        String game5 = "RoverWatch";
        String game6 = "RoverWatch Origins Edition";



        while (true) {

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }

            String input = scanner.nextLine();

            if (input.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", Balanceleft - currentBalance, currentBalance);
                break;
            }

            if (input.equals("OutFall 4")) {
                if (currentBalance - 39.99 >= 0) {
                    currentBalance = currentBalance - 39.99;
                    System.out.println("Bought OutFall 4");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("CS: OG")) {
                if (currentBalance - 15.99 >= 0) {
                    currentBalance = currentBalance - 15.99;
                    System.out.println("Bought CS: OG");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Zplinter Zell")) {
                if (currentBalance - 19.99 >= 0) {
                    currentBalance = currentBalance - 19.99;
                    System.out.println("Bought Zplinter Zell");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Honored 2")) {
                if (currentBalance - 59.99 >= 0) {
                    currentBalance = currentBalance - 59.99;
                    System.out.println("Bought Honored 2");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch")) {
                if (currentBalance - 29.99 >= 0) {
                    currentBalance = currentBalance - 29.99;
                    System.out.println("Bought RoverWatch");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                if (currentBalance - 39.99 >= 0) {
                    currentBalance = currentBalance - 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }


        }
    }
}
