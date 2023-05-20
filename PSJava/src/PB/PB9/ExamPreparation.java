import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, в която Марин решава задачи от изпити, докато не получи съобщение "Enough" от лектора си.
        // При всяка решена задача, той получава оценка. Програмата трябва да приключи прочитането на данни при команда "Enough"
        // или ако Марин получи определеният брой незадоволителни оценки.
        // Незадоволителна е всяка оценка, която е по-малка или равна на 4.

        int bad = Integer.parseInt(scanner.nextLine());

        int scorecount = 0;
        double pointstotal = 0;

        int badpoints = 0;
        String last = "";



        while (true) {


            double averagescore = pointstotal / scorecount;
            String comand = scanner.nextLine();

            if (comand.equals("Enough")) {
                System.out.printf("Average score: %.2f%n",averagescore);
                System.out.printf("Number of problems: %d%n",scorecount);
                System.out.printf("Last problem: %s%n",last);
                break;
            }

            scorecount = scorecount + 1;
            last = comand;

            int points = Integer.parseInt(scanner.nextLine());

            pointstotal = pointstotal + points;

            if (points <= 4) {
                badpoints += 1;
                if (bad == badpoints) {
                    System.out.printf("You need a break, %d poor grades.", bad);
                    break;
                }



            }

        }
    }
}
