import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Григор Димитров е тенисист, чиято следваща цел е изкачването в световната ранглиста по тенис за мъже.
        //
        //През годината Гришо участва в определен брой турнири, като за всеки турнир получава точки,
        // които зависят от позицията, на която е завършил в турнира. Има три варианта за завършване на турнир:

        //§ W - ако е победител получава 2000 точки
        //§ F - ако е финалист получава 1200 точки
        //§ SF - ако е полуфиналист получава 720 точки

        //Напишете програма, която изчислява колко ще са точките на Григор след изиграване на всички турнири,
        // като знаете с колко точки стартира сезона. Също изчислете колко точки средно печели от всички изиграни турнири и колко процента от турнирите е спечелил.

        //Вход
        //От конзолата първо се четат два реда:
        //· Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //· Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //· Достигнат етап от турнира – текст – "W", "F" или "SF"

        //Изход
        //Отпечатват се три реда в следния формат:
        //· "Final points: {брой точки след изиграните турнири}"
        //· "Average points: {средно колко точки печели за турнир}"
        //· "{процент спечелени турнири}%"
        //Средните точки да бъдат закръглени към най-близкото цяло число надолу, а процентът да се форматира до втората цифра след десетичния знак.

        int shampionships = Integer.parseInt(scanner.nextLine());
        int startpoints = Integer.parseInt(scanner.nextLine());

        int points = 0;

        int finishpoints = 0;
        double wins = 0;


        for (int i = 1; i <= shampionships; i++) {
            String finish = scanner.nextLine();


            if (finish.equals("W")) {
                finishpoints = 2000;
                wins = wins + 1;
            } else if (finish.equals("F")) {
                finishpoints = 1200;
            } else if (finish.equals("SF")) {
                finishpoints = 720;
            }

            points = points + finishpoints;


        }

        int totalpoints = points + startpoints;
        int averagepoints = points / shampionships;
        double totalwins = wins * 100 / shampionships;



        System.out.printf("Final points: %d%n", totalpoints);
        System.out.printf("Average points: %d%n", Math.round(averagepoints));
        System.out.printf("%.2f" + "%%", totalwins);



    }
}
