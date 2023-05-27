import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        int correctnum = 1;

        for (int rows = 1; rows <= num; rows++) {


            for (int colons = 1; colons <= rows; colons++) {
                System.out.print(correctnum + " ");
                correctnum++;

                if (correctnum > num) {
                    break;
                }

            }
            if (correctnum > num) {
                break;
            }
            System.out.println();

        }

    }
}