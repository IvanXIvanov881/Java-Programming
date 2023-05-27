import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        //Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s:

        //Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число),
        // въведени от потребителя, и изчислява и извежда размера на търговската комисионна според горната таблица.

        //Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
        // При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double comission = 0;

        boolean isValid = city.equals("Sofia") || city.equals("Varna") || city.equals("Plovdiv");

        if (isValid) {

            if (city.equals("Sofia")) {
                if (s >= 0 && s <= 500) {
                    comission = s * 0.05;
                    System.out.printf("%.2f", comission);
                } else if (s > 500 && s <= 1000) {
                    comission = s * 0.07;
                    System.out.printf("%.2f", comission);
                } else if (s > 1000 && s <= 10000) {
                    comission = s * 0.08;
                    System.out.printf("%.2f", comission);
                } else if (s > 10000) {
                    comission = s * 0.12;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.printf("error");
                }
            }

            if (city.equals("Varna")) {
                if (s >= 0 && s <= 500) {
                    comission = s * 0.045;
                    System.out.printf("%.2f", comission);
                } else if (s > 500 && s <= 1000) {
                    comission = s * 0.075;
                    System.out.printf("%.2f", comission);
                } else if (s > 1000 && s <= 10000) {
                    comission = s * 0.10;
                    System.out.printf("%.2f", comission);
                } else if (s > 10000) {
                    comission = s * 0.13;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.printf("error");
                }
            }

            if (city.equals("Plovdiv")) {
                if (s >= 0 && s <= 500) {
                    comission = s * 0.055;
                    System.out.printf("%.2f", comission);
                } else if (s > 500 && s <= 1000) {
                    comission = s * 0.08;
                    System.out.printf("%.2f", comission);
                } else if (s > 1000 && s <= 10000) {
                    comission = s * 0.12;
                    System.out.printf("%.2f", comission);
                } else if (s > 10000) {
                    comission = s * 0.145;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.printf("error");
                }
            }
        } else {
            System.out.printf("error");
        }

    }
}
