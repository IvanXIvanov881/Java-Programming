import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrsum = 0;
        int wrongindex = 0;

        String inputLine = scanner.nextLine();

        int[] firstArr = Arrays
                .stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputLine2 = scanner.nextLine();

        int[] secondArr = Arrays
                .stream(inputLine2.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isValid = true;

        for (int i = 0; i < firstArr.length; i++) {

            if (firstArr[i] == secondArr[i]) {

                arrsum = arrsum + firstArr[i];
            } else {
                isValid = false;
                wrongindex = i;
              break;
            }
        }

        if (isValid) {
            System.out.printf("Arrays are identical. Sum: %d", arrsum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", wrongindex);

        }

    }
}
