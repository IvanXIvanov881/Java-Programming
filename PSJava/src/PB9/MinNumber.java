import com.sun.jdi.Value;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.MAX_VALUE;
        int correctnum = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("Stop")) {
                break;
            }

            correctnum = Integer.parseInt(input);

            if (correctnum < num) {
                num = correctnum;
            }


        }

        System.out.println(num);

    }
}
