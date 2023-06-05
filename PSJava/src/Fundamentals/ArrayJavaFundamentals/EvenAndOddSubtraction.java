import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nums = scanner.nextLine();

        int[] numbersArr = Arrays
                .stream(nums.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int even = 0;
        int odds = 0;

        for (int i = 0; i < numbersArr.length; i++) {

            if (numbersArr[i] % 2 == 0) {
                even = even + numbersArr[i];
            } else {
                odds = odds + numbersArr[i];
            }

        }

        System.out.printf("%d", even-odds);
    }
}
