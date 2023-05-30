import com.sun.jdi.Value;

import java.security.AlgorithmConstraints;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());

        int[] allNums = new int[inputs];

        for (int i = 0; i < inputs; i++) {
            int totalSum = 0;
            String inputWords = scanner.nextLine();

            for (int j = 0; j < inputWords.length(); j++) {
                char letter = inputWords.charAt(j);
                int num = (int) letter;

                if (num == 65 || num == 97 || num == 69 || num == 101 || num == 85 || num == 117 || num == 73 || num == 79 || num == 105 || num == 111) {
                    totalSum = totalSum + (num * inputWords.length());
                } else {
                    totalSum = totalSum + (num / inputWords.length());
                }

            }

            allNums[i] = totalSum;
        }

        Arrays.sort(allNums);

        for (int j = 0; j < allNums.length; j++) {
            System.out.println(allNums[j]);
        }

    }
}
