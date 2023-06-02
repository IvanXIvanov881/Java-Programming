import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < numbersArr.length; i++) {

            int secondNumbers = 0;
            int firstNumbers = 0;


            for (int j = 0; j < i; j++) {

                secondNumbers = secondNumbers + numbersArr[j];

            }

            for (int j = i + 1; j < numbersArr.length; j++) {
                firstNumbers = firstNumbers + numbersArr[j];

            }

            if (secondNumbers == firstNumbers) {
                System.out.println(i);
                return;
            }

        }


        System.out.println("no");
    }

}
