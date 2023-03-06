import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,и проверява дали сред тях съществува число,
        // което е равно на сумата на всички останали.
        //
        //· Ако има такъв елемент печата "Yes" и на нов ред "Sum = " + неговата стойност
        //
        //· Ако няма такъв елемент печата "No" и на нов ред "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност)

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            sum += nums;

            if (nums > max) {
                max = nums;

            }
        }
int SumWithoutMaxNum = sum - max;

            if (max == SumWithoutMaxNum) {
                System.out.printf ("Yes%n");
                System.out.printf("Sum = " + max);
            } else {
                int Diff = Math.abs(max - SumWithoutMaxNum);
                System.out.printf("No%n");
                System.out.printf("Diff = " + Diff);

            }


    }
}
