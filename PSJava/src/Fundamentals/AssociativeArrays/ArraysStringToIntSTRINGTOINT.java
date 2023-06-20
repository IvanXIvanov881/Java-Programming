import java.util.Arrays;
import java.util.Scanner;

public class ArraysStringToIntSTRINGTOINT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();

        int[] numsArr = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numsArr.length; i++) {
            System.out.printf("%d -> %d\n", i, numsArr[i]);
        }


    }
}

