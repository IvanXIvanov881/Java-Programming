import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());


        double pricewithoutsabers = 0;

        for (int i = 1; i <= students; i++) {

            if (i % 6 == 0) {
                pricewithoutsabers = pricewithoutsabers + robes ;
            } else {
                pricewithoutsabers = pricewithoutsabers + robes + belts;
            }

        }

        double totalprice = pricewithoutsabers + (lightsabers * Math.ceil(students * 1.1));

        if (money >= totalprice) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalprice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalprice - money);
        }

    }
}
