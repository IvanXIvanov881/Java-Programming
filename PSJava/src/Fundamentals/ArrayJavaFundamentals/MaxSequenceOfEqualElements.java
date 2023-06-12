import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numberArr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter1 = 0;
        int counter2 = 0;

        int[] longestNumbers = new int[numberArr.length];

        for (int i = 0; i < numberArr.length - 1; i++) {
            for (int r = i; r < numberArr.length - 1; r++) {

                if (numberArr[i] == numberArr[r]) {

                    for (int t = i; t <= numberArr.length - 1; t++) {
                        if (numberArr[i] == numberArr[t]) {
                            counter1++;
                        } else {
                            break;
                        }
                    }
                }

                if (counter1 > 0 && counter2 < counter1) {
                    for (int j = 0; j < counter1; j++) {
                        longestNumbers[j] = numberArr[i];
                        counter2 = counter1;
                    }
                }

                counter1 = 0;

            }
        }

        if (counter2 > 0) {
            for (int j = 0; j < counter2; j++) {
                System.out.printf("%d ", longestNumbers[j]);
            }
        } else {
            System.out.printf("%d ", numberArr[0]);
        }

    }
}