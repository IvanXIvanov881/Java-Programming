import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rols = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[rols];

        int[] secondArr = new int[rols];

        for (int i = 0; i < rols; i++) {

            int[] newArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {

                firstArr[i] = newArr[0];
                secondArr[i] = newArr[1];

            } else {

                secondArr[i] = newArr[0];
                firstArr[i] = newArr[1];
            }


        }

        for (int j = 0; j <= firstArr.length - 1; j++) {

            System.out.printf("%d ", firstArr[j]);
        }
        System.out.println();

        for (int g = 0; g < secondArr.length; g++) {
            System.out.printf("%d ", secondArr[g]);
        }

    }
}
