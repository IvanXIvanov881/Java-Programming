import java.util.Scanner;

public class StrongNumberCUTNUMBER {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //FACTORIEL
        //  5!  -> 1*2*3*4*5


        int startnumber = Integer.parseInt(scanner.nextLine());

        int number = startnumber;

        int factcorrect = 1;

        int correctfact = 0;

        while (number > 0) {

           int lastdigit = number % 10;

            for (int i = 1; i <= lastdigit; i++) {
                factcorrect = factcorrect * i;
            }

            number = number / 10;

            correctfact += factcorrect;
            factcorrect = 1;

        }

        if (startnumber == correctfact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
