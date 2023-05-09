import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Туристическа агенция предлага екскурзии на различни цени, според сезона и броя на хората. Напишете
        //програма, която да изчислява цената, според данните от таблицата:

        //В зависимост от сезона, може да има отстъпка или оскъпяване на цената, съответно:
        // При "summer" -> 15% отстъпка
        // При "winter" -> 8% оскъпяване

        //Вход:
        //1. Първи ред – брой хора – цяло число в интервала [1 … 20]
        //2. Втори ред – сезон – текст с възможности - "spring", "summer", "autumn" или "winter"

        //Изход:
        // На конзолата се отпечатва 1 ред:
        //• Цената за екскурзията, форматирана до втория знак след десетичния разделител, в следния
        //формат: "{цената} leva."


        int people = Integer.parseInt(scanner.nextLine());
        String seson = scanner.nextLine();

        double total = 0;


        if (seson.equals("spring")) {
            if (people <= 5) {
                total = people * 50.00;
            } else {
                total = people * 48.00;
            }
        }

        if (seson.equals("summer")) {
            if (people <= 5) {
                total = (people * 48.50) * 0.85;
            } else {
                total = (people * 45.00) * 0.85;
            }
        }

        if (seson.equals("autumn")) {
            if (people <= 5) {
                total = people * 60.00;
            } else {
                total = people * 49.50;
            }
        }

        if (seson.equals("winter")) {
            if (people <= 5) {
                total = (people * 86) * 1.08;
            } else {
                total = (people * 85) * 1.08;
            }
        }

        System.out.printf("%.2f leva.",total);


    }
}
