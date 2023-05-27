import java.util.Scanner;


public class FirstProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Бабата на Деси всяка година приготвя обяд за семейството си за Великден. Напишете програма,
        // която изчислява какви разходи ще има по приготвянето на обяда, като знаете колко броя козунаци, кори с яйца и килограма курабии е купила.
        // Цените на продуктите са следните:

        //Козунак  – 3.20 лв.
        //Яйца –  4.35 лв. за кора с 12 яйца
        //Курабии – 5.40 лв. за килограм
        //Боя за яйца - 0.15 лв. за яйце

        //Вход
        //От конзолата се четат 3 реда:
        //Брой козунаци - цяло число в интервала [0 … 99]
        //Брой кори с яйца - цяло число в интервала [0 … 99]
        //Килограми курабии - цяло число в интервала [0 … 99]

        //Изход
        //Да се отпечата на конзолата колко ще са разходите по приготвянето на обяда. Сумата да бъде форматирана до втория знак след десетичната запетая.

        int kozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double kozunacitotal = kozunak * 3.20;
        double eggstotal = eggs * 4.35;
        double cookiestotal = cookies * 5.40;
        double eggspaint = (eggs * 12) * 0.15;

        double total = kozunacitotal + eggstotal + eggspaint + cookiestotal;

        System.out.printf("%.2f", total);

    }
}