import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double total = 0;
        for (int i = 1; i <= n; i++) {

            double pricepercapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double orderPrice = pricepercapsule * days * capsules;
            total = total + orderPrice;
            System.out.printf("The price for the coffee is: $%.2f\n", orderPrice);

        }

        System.out.printf("Total: $%.2f", total);
    }
}
