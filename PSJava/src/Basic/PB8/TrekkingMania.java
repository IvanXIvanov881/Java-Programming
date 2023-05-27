import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Катерачи от цяла България се събират на групи и набелязват следващите върхове за изкачване.
        // Според размера на групата, катерачите ще изкачват различни върхове.

        //· Група до 5 човека – изкачват Мусала
        //· Група от 6 до 12 човека – изкачват Монблан
        //· Група от 13 до 25 човека – изкачват Килиманджаро
        //· Група от 26 до 40 човека – изкачват К2
        // Група от 41 или повече човека – изкачват Еверест
        //Да се напише програма, която изчислява процента на катерачите изкачващи всеки връх.

        //Вход
        //От конзолата се четат поредица от числа, всяко на отделен ред:
        //· На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
        //· За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]

        //Изход
        //Да се отпечатат на конзолата 5 реда, всеки от които съдържа процент между 0.00% и 100.00% с точност до втората цифра след десетичната запетая.
        //· Първи ред - процентът изкачващи Мусала
        //· Втори ред – процентът изкачващи Монблан
        //· Трети ред – процентът изкачващи Килиманджаро
        //· Четвърти ред – процентът изкачващи К2
        //· Пети ред – процентът изкачващи Еверест

        int grups = Integer.parseInt(scanner.nextLine());


        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        double totalpeople = 0;

        for (int i = 1; i <= grups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            totalpeople = totalpeople + people;


            if (people <= 5) {
                musala = musala + people;
            } else if (people >= 6 && people <= 12) {
                monblan =monblan + people;
            } else if (people >= 13 && people <= 25) {
                kilimanjaro = kilimanjaro + people;
            } else if (people >= 26 && people <= 40) {
                k2 = k2 + people;
            } else if (people >= 41) {
                everest = everest + people;
            }
        }

        double musalatotal = (musala * 100 /totalpeople );
        double monblantotal = (monblan * 100 /totalpeople );
        double kilimanjarototal = (kilimanjaro * 100 /totalpeople );
        double k2total = (k2 * 100 /totalpeople );
        double everesttotal = (everest * 100 /totalpeople );


        System.out.printf( "%.2f" + "%%" + "%n",musalatotal);
        System.out.printf( "%.2f" + "%%" + "%n",monblantotal);
        System.out.printf( "%.2f" + "%%" + "%n",kilimanjarototal);
        System.out.printf( "%.2f" + "%%" + "%n",k2total);
        System.out.printf( "%.2f" + "%%" + "%n" ,everesttotal);

    }
}
