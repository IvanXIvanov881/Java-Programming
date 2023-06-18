import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int trains = Integer.parseInt(scanner.nextLine());

        int[] people = new int[trains];

        int countpeople = 0;

        for (int i = 0; i < people.length; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());

            countpeople = countpeople + people[i];

            if (i == people.length - 1) {
                for (int j = 0; j < people.length; j++)
                    System.out.printf("%d ", people[j]);
            }

        }

        System.out.printf("\n%d", countpeople);


    }
}
