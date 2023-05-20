import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Михаела държи сама да организира и заплати моминското си парти. Тя планува плащането да стане с
        //приходите от онлайн магазина й. Да се напише програма, която пресмята печалбата от продажбите й.
        //Цени на различните артикули:
        // Любовно послание - 0.60 лв.
        // Восъчна роза - 7.20 лв.
        // Ключодържател - 3.60 лв.
        // Карикатура - 18.20 лв.
        // Късмет изненада - 22 лв.

        //Ако поръчаните артикули са 25 или повече магазинът прави отстъпка 35% от общата цена. От спечелените
        //пари Михаела трябва да предвиди и 10% разход за хостинг. Да се пресметне дали парите ще й стигнат да си
        //плати моминското парти.
        //Вход
        //От конзолата се четат 6 реда:
        //1. Цена на моминското парти - реално число в интервала [1.00 … 10000.00]
        //2. Брой любовни послания - цяло число в интервала [0… 1000]
        //3. Брой восъчни рози - цяло число в интервала [0 … 1000]
        //4. Брой ключодържатели - цяло число в интервала [0 … 1000]
        //5. Брой карикатури - цяло число в интервала [0 … 1000]
        //6. Брой късмети изненада - цяло число в интервала [0 … 1000]
        //Изход
        //На конзолата се отпечатва:
        // Ако парите са достатъчни се отпечатва:
        //o "Yes! {оставащите пари} lv left."
        // Ако парите НЕ са достатъчни се отпечатва:
        //o "Not enough money! {недостигащите пари} lv needed."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.

        double party = Double.parseDouble(scanner.nextLine());
        int poslanie = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kliuchodurjateli = Integer.parseInt(scanner.nextLine());
        int karikatura = Integer.parseInt(scanner.nextLine());
        int kusmeti = Integer.parseInt(scanner.nextLine());

        double totalposlanie = poslanie * 0.60;
        double totalrozi = rozi * 7.20;
        double totalkliuchodurjatel = kliuchodurjateli * 3.60;
        double totalkarikatura = karikatura * 18.20;
        double totalkusmet = kusmeti * 22;

        int totalartikuli = poslanie + rozi + kliuchodurjateli + karikatura + kusmeti;

        double totalwin = totalposlanie + totalrozi + totalkliuchodurjatel + totalkarikatura + totalkusmet;

        double total = 0;

        if (totalartikuli >= 25 ) {
            totalwin = totalwin * 0.65;
        }

        double totalwin1 = totalwin * 0.90;

        if (totalwin1 >= party) {
            double yes = totalwin1 - party;
           System.out.printf( "Yes! %.2f lv left.",yes);
        } else {
            double no = party - totalwin1;
            System.out.printf("Not enough money! %.2f lv needed.",no);
        }

    }
}
