import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Тони и приятели много обичали да ходят за риба,
        // те са толкова запалени по риболова, че решават да отидат на риболов с кораб.
        // Цената за наема на кораба зависи от сезона и броя рибари.

        //Цената зависи от сезона:
        //· Цената за наем на кораба през пролетта е 3000 лв.
        //· Цената за наем на кораба през лятото и есента е 4200 лв.
        //· Цената за наем на кораба през зимата е 2600 лв.

        //В зависимост от броя си групата ползва отстъпка:
        //· Ако групата е до 6 човека включително – отстъпка от 10%.
        //· Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //· Ако групата е от 12 нагоре – отстъпка от 25%.

        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
        //Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

        //Вход
        //От конзолата се четат точно три реда.
        //· Бюджет на групата – цяло число в интервала [1…8000]
        //· Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        //· Брой рибари – цяло число в интервала [4…18]

        //Изход
        //Да се отпечата на конзолата един ред:
        //· Ако бюджетът е достатъчен:
        //"Yes! You have {останалите пари} leva left."
        //· Ако бюджетът НЕ Е достатъчен:
        //"Not enough money! You need {сумата, която не достига} leva."
        //Сумите трябва да са форматирани с точност до два знака след десетичната запетая.

        int budget = Integer.parseInt(scanner.nextLine());
        String sesson = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());
        double boatprice=0;

        if (sesson.equals("Spring") || sesson.equals("Summer") || sesson.equals("Autumn") || sesson.equals("Winter")) {



            if (sesson.equals("Spring")) {
                boatprice = 3000;
            } else if (sesson.equals("Summer")) {
                boatprice = 4200;
            } else if (sesson.equals("Autumn")) {
                boatprice = 4200;
            } else if (sesson.equals("Winter")) {
                boatprice = 2600;
            }


            if (sesson.equals("Spring")) {
                if (fishermans <= 6) {
                    boatprice = 3000 * 0.90;

                } else if (fishermans > 6 && fishermans <= 11) {
                    boatprice = 3000 * 0.85;

                } else if (fishermans > 12) {
                    boatprice = 3000 * 0.75;
                }
            } else if (sesson.equals("Summer")) {
                if (fishermans <= 6) {
                    boatprice = 4200 * 0.90;

                } else if (fishermans > 6 && fishermans <= 11) {
                    boatprice = 4200 * 0.85;

                } else if (fishermans > 12) {
                    boatprice = 4200 * 0.75;
                }
            } else if (sesson.equals("Autumn")) {
                if (fishermans <= 6) {
                    boatprice = 4200 * 0.90;

                } else if (fishermans > 6 && fishermans <= 11) {
                    boatprice = 4200 * 0.85;;

                } else if (fishermans > 12) {
                    boatprice = 4200 * 0.75;;
                }
            } else if (sesson.equals("Winter")) {
                if (fishermans <= 6) {
                    boatprice = 2600 * 0.90;

                } else if (fishermans > 6 && fishermans <= 11) {
                    boatprice = 2600 * 0.85;

                } else if (fishermans > 12) {
                    boatprice = 2600 * 0.75;
                }
            }

            if ((fishermans % 2 == 0) && sesson.equals("Spring")) {
                boatprice = boatprice * 0.95;
            } else if ((fishermans % 2 == 0) && sesson.equals("Summer")) {
                boatprice = boatprice * 0.95;
            } else if ((fishermans % 2 == 0) && sesson.equals("Winter")) {
                boatprice = boatprice * 0.95;
            }


            if (budget >= boatprice) {
                double total = budget - boatprice;
                System.out.printf("Yes! You have %.2f leva left.", total);
            } else if (boatprice > budget) {
                double total = boatprice - budget;
                System.out.printf("Not enough money! You need %.2f leva.", total);
            }

        }
    }
}
