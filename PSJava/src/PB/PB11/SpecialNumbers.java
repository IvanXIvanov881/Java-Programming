import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Да се напише програма, която чете едно цяло число N, въведено от потребителя, и генерира всички възможни "специални" числа от 1111 до 9999.
        // За да бъде "специално" едно число, то трябва да отговаря на следното условие:
        //
        //· N да се дели на всяка една от неговите цифри без остатък.

        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1111; i <= 9999; i++) {
            counter = 0;
            double num4 = (i % 10);
            if (N % num4 == 0) {
                counter++;
            }
            double num3 = (i % 100) / 10;
            if (N % num3 == 0) {
                counter++;
            }
            double num2 = (i % 1000) / 100;
            if (N % num2 == 0) {
                counter++;
            }

            double num1 = i / 1000;
            if (N % num1 == 0) {
                counter++;
            }

            if (counter == 4) {
                System.out.printf(i + " ");
            }
        }
    }
}
