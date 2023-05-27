import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
// Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
//Важат следните цени:
//· Видеокарта – 250 лв./бр.
//· Процесор – 35% от цената на закупените видеокарти/бр.
//· Рам памет – 10% от цената на закупените видеокарти/бр.
//Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.

        double money = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int procesor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //Вход
        //Входът се състои от четири реда:
        //1. Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2. Броят видеокарти - цяло число в интервала [0…100]
        //3. Броят процесори - цяло число в интервала [0…100]
        //4. Броят рам памет - цяло число в интервала [0…100]
        double videototal = video * 250;

        double procesorprice = videototal * 0.35;
        double procesortotal = procesorprice * procesor;

        double ramprice = videototal * 0.1;
        double ramtotal = ramprice * ram;

        double totalprice = videototal + procesortotal + ramtotal;

        if (video > procesor) {
            totalprice = totalprice - (totalprice * 15 / 100);
        }

        if (money >= totalprice) {
            double moneyleft = money - totalprice;
            System.out.printf("You have %.2f leva left!", moneyleft);
        } else {
            double needmore = totalprice - money;
            System.out.printf("Not enough money! You need %.2f leva more!", needmore);
        }
        //Изход
        //На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
        //· Ако бюджета е достатъчен:
        //"You have {остатъчен бюджет} leva left!"
        //· Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"
        //Резултатът да се форматира до втория знак след десетичната запетая.

    }
}
