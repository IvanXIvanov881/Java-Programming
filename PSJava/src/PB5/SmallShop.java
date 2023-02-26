import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        //град /  coffee water beer sweets peanuts
        //Sofia   0.50 0.80 1.20 1.45 1.60
        //Plovdiv 0.40 0.70 1.15 1.30 1.50
        //Varna   0.45 0.70 1.10 1.35 1.55

        //Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:

        //Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
        // въведени от потребителя и пресмята и отпечатва колко струва съответното количество от избрания продукт в посочения град.

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double num = Double.parseDouble(scanner.nextLine());

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                System.out.println(num * 0.50);
            }
            else if (product.equals("water")) {
                System.out.println(num * 0.80);
            }
            else if (product.equals("beer")) {
                System.out.println(num * 1.20);
            }
            else if (product.equals("sweets")) {
                System.out.println(num * 1.45);
            }
            else if (product.equals("peanuts")) {
                System.out.println(num * 1.60);
            }
        }

        if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(num * 0.40);
            }
            else if (product.equals("water")) {
                System.out.println(num * 0.70);
            }
            else if (product.equals("beer")) {
                System.out.println(num * 1.15);
            }
            else if (product.equals("sweets")) {
                System.out.println(num * 1.30);
            }
            else if (product.equals("peanuts")) {
                System.out.println(num * 1.50);
            }
        }


        if (city.equals("Varna")) {
            if (product.equals("coffee")) {
                System.out.println(num * 0.45);
            }
            else if (product.equals("water")) {
                System.out.println(num * 0.70);
            }
            else if (product.equals("beer")) {
                System.out.println(num * 1.10);
            }
            else if (product.equals("sweets")) {
                System.out.println(num * 1.35);
            }
            else if (product.equals("peanuts")) {
                System.out.println(num * 1.55);
            }
        }


    }
}
