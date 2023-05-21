import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstNumbers = scanner.nextLine();

        int[] firstNumbersArray = Arrays
                .stream(firstNumbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {


            String[] input = scanner.nextLine().split(" ");


            if (input[0].equals("end")) {
                break;
            }

            if (input[0].equals("swap")) {

                int position1 = Integer.parseInt(input[1]);
                int position2 = Integer.parseInt(input[2]);

                int number1 = firstNumbersArray[position1];
                int number2 = firstNumbersArray[position2];

                firstNumbersArray[position1] = number2;
                firstNumbersArray[position2] = number1;
            }

            if (input[0].equals("multiply")) {

                int position1 = Integer.parseInt(input[1]);
                int position2 = Integer.parseInt(input[2]);

                int number1 = firstNumbersArray[position1] * firstNumbersArray[position2];

                firstNumbersArray[position1] = number1;

            }

            if (input[0].equals("decrease")) {

                for (int i = 0 ; i < firstNumbersArray.length; i ++) {
                    firstNumbersArray[i] = firstNumbersArray[i] - 1;
                }
            }

        }

        System.out.printf("%d", firstNumbersArray[0]);
        for (int i = 1; i < firstNumbersArray.length; i++) {
            System.out.printf(", %d", firstNumbersArray[i]);
        }

    }
}
