import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numsArr = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int even = 0;

        for (int i = 0; i < numsArr.length; i++) {

            if (numsArr[i] % 2 == 0) {
                even = even + numsArr[i];
            }
        }
System.out.printf("%d",even);

    }
}
