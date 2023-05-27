import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstletter = scanner.nextLine().charAt(0);
        char lastletter = scanner.nextLine().charAt(0);
        char forbiddenletter = scanner.nextLine().charAt(0);

        int counter = 0;

        for (int i = firstletter; i <= lastletter; i++) {
            for (int j = firstletter; j <= lastletter; j++) {
                for (int k = firstletter; k <= lastletter; k++) {


                    if (i != forbiddenletter && j != forbiddenletter && k != forbiddenletter) {
                        System.out.printf("%s%s%s ", (char) i, (char) j, (char) k);
                        counter++;
                    }

                }
            }
        }

        System.out.printf("%d", counter);

    }
}
