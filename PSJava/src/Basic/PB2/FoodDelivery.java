import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        //От конзолата се четат 3 реда:
        //· Брой пилешки менюта – цяло число в интервала [0 … 99]
        //· Брой менюта с риба – цяло число в интервала [0 … 99]
        //· Брой вегетариански менюта – цяло число в интервала [0 … 99]

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        //Ресторант отваря врати и предлага няколко менюта на преференциални цени:
        //• Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

        double chickenprice = chicken * 10.35;
        double fishprice = fish * 12.40;
        double veganprice = vegan * 8.15;
        double all = chickenprice + fishprice + veganprice;
        double desertprice = all - (all * 80 /100);
        double delivery = 2.50;

        double total = chickenprice + fishprice + veganprice + desertprice + delivery;



        //Изход
        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Да се отпечата на конзолата един ред: "{цена на поръчката}"

        System.out.printf("{цена на поръчката}" + total);




    }

}
