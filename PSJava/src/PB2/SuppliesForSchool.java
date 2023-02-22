import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {


        //От конзолата се четат 4 числа:
        //Брой пакети химикали - цяло число в интервала [0...100]
        //Брой пакети маркери - цяло число в интервала [0...100]
        //Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //Процент намаление - цяло число в интервала [0...100]

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int agents = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        //ценоразпис:
        //Пакет химикали - 5.80 лв.
        //Пакет маркери - 7.20 лв.
        //Препарат - 1.20 лв (за литър)

        double pensprice = pens * 5.80;
        double markersprice = markers * 7.20;
        double agentsprice = agents * 1.20;


        //Да се отпечата на конзолата колко пари ще са нужни на Ани, за да си плати сметката.

        double prace = pensprice + markersprice + agentsprice;
        double total = prace - (prace * discount / 100);

        System.out.println(total);


    }
}
