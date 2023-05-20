import javax.management.InstanceNotFoundException;
import java.util.Scanner;

public class EasterCompetiton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //С наближаването на Великден, пекарна организира конкурс за направата на най-хубав козунак.
        // Напишете програма, която да намира сладкаря с най-висок резултат. В началото на конкурса се въвежда броя на козунаците,
        // които ще бъдат дегустирани от посетителите на пекарната, като за всеки козунак различен брой посетители, ще дадат оценка от 1 до 10.


        //Вход
        //Първоначално от конзолата се прочита броя на козунаците – цяло число в интервала [1… 100]
        //След това за всеки козунак се прочита:
        //Името на пекаря, който е направил козунака – текст
        //До получаване на командата "Stop" се прочита
        //оценка за козунак от един човек  – цяло число в интервала [1... 10]


        //Изход
        //След получаване на командата "Stop" се печата един ред:
        //"{името на пекаря} has {общият брой получени точки} points."
        //Ако след командата "Stop", пекарят е с най-много точки до момента, да се отпечата допълнителен ред:
        //"{името на пекаря} is the new number 1!"
        //След дегустация на всички козунаци, да се отпечата един ред:
        //"{името на пекаря с най-много точки} won competition with {точките на пекаря} points!"


        int kozunaci = Integer.parseInt(scanner.nextLine());

        String winnername = "";

        int points = 0;


        for (int i = 1; i <= kozunaci; i++) {


            String name = scanner.nextLine();
            int pointsnow = 0;

            while (true) {


                String ocenka = scanner.nextLine();

                if (ocenka.equals("Stop")) {


                    if (pointsnow > points) {
                        System.out.printf("%s has %d points.%n", name, pointsnow);
                        System.out.printf("%s is the new number 1!%n",name);
                        points = pointsnow;
                        winnername = name;
                        break;
                    } else {
                        System.out.printf("%s has %d points.%n", name, pointsnow);
                        break;
                    }


                }
                int notstop = Integer.parseInt(ocenka);
                pointsnow = pointsnow + notstop;


            }
        }


        System.out.printf("%s won competition with %d points!",winnername,points);

    }
}