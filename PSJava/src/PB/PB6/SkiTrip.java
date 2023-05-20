import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        //Атанас решава да прекара отпуската си в Банско и да кара ски. Преди да отиде обаче,
        // трябва да резервира хотел и да изчисли колко ще му струва престоя. Налични са следните видове помещения,
        // със следните цени за престой:

        //§ "room for one person" – 18.00 лв за нощувка
        //§ "apartment" – 25.00 лв за нощувка
        //§ "president apartment" – 35.00 лв за нощувка

        //Според броят на дните, в които ще остане в хотела (пример: 11 дни = 10 нощувки) и видът на помещението,
        // което ще избере, той може да ползва различно намаление.

        //След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
        // Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея.
        // Ако оценката му е негативна приспада от цената 10%.

        //Вход
        //Входът се чете от конзолата и се състои от три реда:
        //· Първи ред - дни за престой - цяло число в интервала [0...365]
        //· Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //· Трети ред - оценка - "positive" или "negative"

        Scanner scanner = new Scanner (System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomtype = scanner.nextLine();
        String ocenka = scanner.nextLine();
        double price = 0;
        double totalprice = 0;

    if (days < 10) {
        if (roomtype.equals("room for one person")) {
            totalprice = 18 * (days - 1);

        } else if (roomtype.equals("apartment")) {
            price = 25 * (days - 1);
            totalprice = price * 0.70;

        } else if (roomtype.equals("president apartment")) {
            price = 35 * (days - 1);
            totalprice = price * 0.90;

        }
    } else if (days > 10 && days <= 15) {
        if (roomtype.equals("room for one person")) {
            totalprice = 25 * (days - 1);


        } else if (roomtype.equals("apartment")) {
            price = 25 * (days - 1);
            totalprice = price * 0.65;

        } else if (roomtype.equals("president apartment")) {
            price = 35 * (days - 1);
            totalprice = price * 0.85;

        }

    } else if (days > 15) {
        if (roomtype.equals("room for one person")) {
            totalprice = 18 * (days - 1);


        } else if (roomtype.equals("apartment")) {
            price = 25 * (days - 1);
            totalprice = price * 0.50;

        } else if (roomtype.equals("president apartment")) {
            price = 35 * (days - 1);
            totalprice = price * 0.80;

        }
    }

    if (ocenka.equals("positive")) {
        double totalprice1 = totalprice * 1.25;
        System.out.printf("%.2f", totalprice1);
    } else if (ocenka.equals("negative")) {
        double totalprice1 = totalprice * 0.90;
        System.out.printf("%.2f", totalprice1);
    }


    }
}
