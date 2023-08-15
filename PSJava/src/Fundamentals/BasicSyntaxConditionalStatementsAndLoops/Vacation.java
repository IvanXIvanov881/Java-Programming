import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalprice = 0;


        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                if (people >= 30) {
                    totalprice = (people * 8.45) * 0.85;
                } else {
                    totalprice = people * 8.45;
                }
            } else if (day.equals("Saturday")) {
                if (people >= 30) {
                    totalprice = (people * 9.80) * 0.85;
                } else {
                    totalprice = people * 9.80;
                }
            } else if (day.equals("Sunday")) {
                if (people >= 30) {
                    totalprice = (people * 10.46) * 0.85;
                } else {
                    totalprice = people * 10.46;
                }
            }
        }

        if (type.equals("Business")) {
            if (day.equals("Friday")) {
                if (people >= 100) {
                    totalprice = (people - 10) * 10.90;
                } else {
                    totalprice = people * 10.90;
                }
            } else if (day.equals("Saturday")) {
                if (people >= 100) {
                    totalprice = (people - 10) * 15.60;
                } else {
                    totalprice = people * 15.60;
                }
            } else if (day.equals("Sunday")) {
                if (people >= 100) {
                    totalprice = (people - 10) * 16;
                } else {
                    totalprice = people * 16;
                }
            }

        }

        if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                if (people >= 10 && people <= 20) {
                    totalprice = (people * 15) * 0.95;
                } else {
                    totalprice = people * 15;
                }
            } else if (day.equals("Saturday")) {
                if (people >= 10 && people <= 20) {
                    totalprice = (people * 20) * 0.95;
                } else {
                    totalprice = people * 20;
                }
            } else if (day.equals("Sunday")) {
                if (people >= 10 && people <= 20) {
                    totalprice = (people * 22.50) * 0.95;
                } else {
                    totalprice = people * 22.50;

                }
            }

        }

        System.out.printf("Total price: %.2f",totalprice);

    }
}
