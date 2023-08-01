import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostgames = Integer.parseInt(scanner.nextLine());
        double headsetprice = Double.parseDouble(scanner.nextLine());
        double mouseprice = Double.parseDouble(scanner.nextLine());
        double keyboardprice = Double.parseDouble(scanner.nextLine());
        double displayprice = Double.parseDouble(scanner.nextLine());

        double price = 0;

        for (int i = 1; i <= lostgames; i++) {

            if (i % 2 == 0) {
                price = price + headsetprice;
            }
            if (i % 3 == 0){
                price = price + mouseprice;
            }
            if (i % 6 == 0) {
                price = price + keyboardprice;
            }
            if (i % 12 == 0) {
                price = price + displayprice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.",price);

    }
}
