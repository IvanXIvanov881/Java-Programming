import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        //Магазин за плодове през работните дни работи на следните цени:
        //плод banana apple orange grapefruit kiwi pineapple grapes
        //цена 2.50 1.20 0.85 1.45 2.70 5.50 3.85

        //Събота и неделя магазинът работи на по-високи цени:
        //плод banana apple orange grapefruit kiwi pineapple grapes
        //цена 2.70 1.25 0.90 1.60 3.00 5.60 4.20

        //Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes), ден от седмицата
        // (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество (десетично число) ,
        // въведени от потребителя, и пресмята цената според цените от таблиците по-горе.
        // При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday")) {

            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                    day.equals("Friday")) {
                switch (fruit) {
                    case ("banana"):
                        double banana1 = 2.50 * count;
                        System.out.printf("%.2f", banana1);
                        break;
                    case ("apple"):
                        double apple1 = 1.20 * count;
                        System.out.printf("%.2f", apple1);
                        break;
                    case ("grapefruit"):
                        double grapefruit1 = 1.20 * count;
                        System.out.printf("%.2f", grapefruit1);
                        break;
                    case ("orange"):
                        double orange1 = 0.85 * count;
                        System.out.printf("%.2f", orange1);
                        break;
                    case ("kiwi"):
                        double kiwi1 = 2.70 * count;
                        System.out.printf("%.2f", kiwi1);
                        break;
                    case ("pineapple"):
                        double pineapple1 = 5.50 * count;
                        System.out.printf("%.2f", pineapple1);
                        break;
                    case ("grapes"):
                        double grapes1 = 3.85 * count;
                        System.out.printf("%.2f", grapes1);
                        break;
                    default:
                        System.out.printf("error");
                }
            }
            if (day.equals("Saturday") || day.equals("Sunday")) {
                switch (fruit) {
                    case ("banana"):
                        double banana1 = 2.70 * count;
                        System.out.printf("%.2f", banana1);
                        break;
                    case ("apple"):
                        double apple1 = 1.25 * count;
                        System.out.printf("%.2f", apple1);
                        break;
                    case ("grapefruit"):
                        double grapefruit1 = 1.60 * count;
                        System.out.printf("%.2f", grapefruit1);
                        break;
                    case ("orange"):
                        double orange1 = 0.90 * count;
                        System.out.printf("%.2f", orange1);
                        break;
                    case ("kiwi"):
                        double kiwi1 = 3.00 * count;
                        System.out.printf("%.2f", kiwi1);
                        break;
                    case ("pineapple"):
                        double pineapple1 = 5.60 * count;
                        System.out.printf("%.2f", pineapple1);
                        break;
                    case ("grapes"):
                        double grapes1 = 4.20 * count;
                        System.out.printf("%.2f", grapes1);
                        break;
                    default:
                        System.out.printf("error");
                }
            }


        } else {
            System.out.printf("error");

        }
    }
}
