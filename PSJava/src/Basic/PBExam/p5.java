import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Туристическа фирма разпродава финални екскурзионни пакети за края на годината. Напишете програма,
        // която да изчислява, печалбата от разпродажбата и дали са продадени всички пакети или не, като знаете първоначалния брой екскурзии и техните цени.
        // Фирмата предлага два вида екскурзии – море ("sea") на цена 680 лева и планина ("mountain") на цена 499 лева. При избор на даден пакет,
        // към общата сума се добавя съответната цена.
        // При избор на пакет, който вече не е наличен (броят му е равен на 0), не трябва да се добавя към общата цена.

        //Вход:
        //От конзолата първоначално се четат 2 реда:
        //Брой екскурзии за море – цяло число в интервала [1… 500]
        //Брой екскурзии за планина – цяло число в интервала [1… 500]
        //След това се чете по един ред до получаване на команда "Stop" или докато фирмата не продаде всички пакети:
        //Име на пакет – текст с възможности "sea" или "mountain"

        //Изход:
        //На конзолата се отпечатват 1 или  2 реда, според случая:
        //Ако фирмата е успяла да продаде всички пакети:
        //" Good job! Everything is sold."
        //Винаги се отпечатва:
        //"Profit: {печалба от продажбите} leva."

        int sea = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());

        //seaprice = 680;
        //monthprice = 499;


        double totalwin = 0;

        int countersea = 0;
        int countermonth = 0;

        //int totalpack = sea + month;

        while (true) {

            if (countermonth >= month && countersea >= sea) {
                System.out.printf("Good job! Everything is sold.%n");
                break;
            }

            String input = scanner.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            if (input.equals("sea")) {
                countersea++;
                if (countersea <= sea) {
                    totalwin = totalwin + 680;
                }
            }
            if (input.equals("mountain")) {
                countermonth++;
                if (countermonth <= month) {
                    totalwin = totalwin + 499;
                }
            }

        }


        System.out.printf("Profit: %.0f leva.", totalwin);
    }
}
