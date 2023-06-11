import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int magicNum = Integer.parseInt(scanner.nextLine());

        int[] arrayNumbers = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i<= arrayNumbers.length-1; i++) {
            for (int j = i; j<= arrayNumbers.length-1; j++) {

                if(arrayNumbers[i] + arrayNumbers[j] == magicNum && i != j) {
                    System.out.printf("%d %d\n",arrayNumbers[i],arrayNumbers[j]);
                }

            }
        }


    }
}
