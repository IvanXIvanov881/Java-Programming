import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Курсът "Train the trainers" е към края си и финалното оценяване наближава. Вашата задача е да помогнете на журито което ще оценява презентациите,
        // като напишете програма в която да изчислява средната оценка от представянето на всяка една презентация от даден студент,
        // а накрая средният успех от всички тях.
        //
        //От конзолата на първият ред се прочита броят на хората в журито n - цяло число в интервала [1…20]
        //
        //След това на отделен ред се прочита името на презентацията - текст
        //
        //За всяка една презентация на нов ред се четат n - на брой оценки - реално число в интервала [2.00…6.00]
        //
        //След изчисляване на средната оценка за конкретна презентация, на конзолата се печата
        //
        //"{името на презентацията} - {средна оценка}."
        //
        //След получаване на команда "Finish" на конзолата се печата "Student's final assessment is {среден успех от всички презентации}." и програмата приключва.
        //
        //Всички оценки трябва да бъдат форматирани до втория знак след десетичната запетая.

        int juri = Integer.parseInt(scanner.nextLine());


        double scoresnow = 0;
        int counterproblems = 0;
        double total2 = 0;
        while (true) {


            String workname = scanner.nextLine();
            scoresnow = 0;
            if (workname.equals("Finish")) {
                double total = total2 / counterproblems;
                System.out.printf("Student's final assessment is %.2f.%n", total);
                break;
            }
            counterproblems++;

            for (int i = 1; i <= juri; i++) {

                double score = Double.parseDouble(scanner.nextLine());
                scoresnow = scoresnow + score;
            }
            double totalnow = scoresnow / juri;
            System.out.printf("%s - %.2f.%n", workname, totalnow);
            total2 = total2 + totalnow;

        }

    }
}
