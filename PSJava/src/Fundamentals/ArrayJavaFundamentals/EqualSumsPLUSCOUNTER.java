import java.util.Arrays;
import java.util.Scanner;

public class EqualSumsPLUSCOUNTER {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstNumbers = 0;
        int secondNumbers = 0;
        String first = "";
        String second = "";
        int counterfirst = 0;
        int countersecond = 0;

        boolean isValid = false;

        for (int i = 0; i < numbersArr.length - 1; i++) {
            //first = "";
            second = "";
            secondNumbers = 0;
            countersecond = counterfirst + 2;
            firstNumbers = firstNumbers + numbersArr[i];
            first = first + "a[" + counterfirst + "]";

            for (int j = numbersArr.length - 1; j > i + 1; j--) {

                secondNumbers = secondNumbers + numbersArr[j];


                second = second + "b[" + countersecond + "]";

                if (firstNumbers == secondNumbers) {
                    System.out.printf("At a[%d] -> left sum = %d, right sum = %d%n", i + 1, firstNumbers, secondNumbers);
                    System.out.printf("%s = %s%n", first, second);

                    isValid = true;
                    return;

                }


                second = second + " + ";
                countersecond++;
            }
            first = first + " + ";
            counterfirst++;
        }

        if (!isValid) {
            System.out.println("No such index exists");
        }

    }
}
