import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
        // На първия ред ще получите името на ученика, а на всеки следващ ред неговите годишни оценки.

        //Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00.

        //Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва, като се отпечатва името на ученика и в кой клас бива изключен.

        String name = scanner.nextLine();
        int years = 0;
        double averagescore = 0;
        int bad = 0;

        while (true) {

            double score = Double.parseDouble(scanner.nextLine());

            if (score >= 4.00) {
                years += 1;
                averagescore = averagescore + score;

            } else {
                bad = bad + 1;
            }

            if (bad >= 2) {
                years += 1;
                System.out.printf("%s has been excluded at %d grade", name, years);
                break;
            }

            if (years == 12) {
                double averagescoretotal = averagescore / 12;
                System.out.printf("%s graduated. Average grade: %.2f", name, averagescoretotal);
                break;
            }

        }


    }
}
