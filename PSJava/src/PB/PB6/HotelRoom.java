import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        //Хотел предлага 2 вида стаи: студио и апартамент. Напишете програма, която изчислява цената за целия престой за студио и апартамент.
        // Цените зависят от месеца на престоя:

        //Май и октомври Юни и септември Юли и август
        //Студио – 50 лв./нощувка Студио – 75.20 лв./нощувка Студио – 76 лв./нощувка
        //Апартамент – 65 лв./нощувка Апартамент – 68.70 лв./нощувка Апартамент – 77 лв./нощувка

        //Предлагат се и следните отстъпки:
        //· За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //· За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //· За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //· За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        //Вход
        //Входът се чете от конзолата и съдържа точно 2 реда, въведени от потребителя:
        //· На първия ред е месецът – May, June, July, August, September или October
        //· На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]

        //Изход
        //Да се отпечатат на конзолата 2 реда:
        //· На първия ред: "Apartment: {цена за целият престой} lv."
        //· На втория ред: "Studio: {цена за целият престой} lv."
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        String mount = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());





        if (mount.equals("May") || mount.equals("October")) {

            double studio = 50 * nights;
            double apartment = 65 * nights;
            if (nights <= 7) {
                double totalstudio = studio;
                double totalapartment = apartment;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (7 < nights && nights <= 14) {
                double totalstudio = studio * 0.95;
                double totalapartment = apartment;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (14 < nights) {
                double totalstudio = studio * 0.70;
                double totalapartment = apartment * 0.90;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            }

        } else if (mount.equals("June") || mount.equals("September")) {
            double studio = 75.20 * nights;
            double apartment = 68.70 * nights;
            if (nights < 7) {
                double totalstudio = studio;
                double totalapartment = apartment ;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (7 <= nights && nights <= 14) {
                double totalstudio = studio;
                double totalapartment = apartment;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (14 < nights) {
                double totalstudio = studio * 0.80;
                double totalapartment = apartment * 0.90;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            }

        } else if (mount.equals("July") || mount.equals("August")) {
            double studio = 76 * nights;
            double apartment = 77 * nights;
            if (nights < 7) {
                double totalstudio = studio;
                double totalapartment = apartment;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (7 <= nights && nights <= 14) {
                double totalstudio = studio;
                double totalapartment = apartment;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            } else if (14 < nights) {
                double totalstudio = studio;
                double totalapartment = apartment * 0.90;
                System.out.printf("Apartment: %.2f lv.\n", totalapartment);
                System.out.printf("Studio: %.2f lv.", totalstudio);
            }
        }



    }
}
