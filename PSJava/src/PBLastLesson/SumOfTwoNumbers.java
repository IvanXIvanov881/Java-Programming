import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа. На изхода се отпечатва,
        // коя поред е комбинацията
        // чиито сбор от числата е равен на дадено магическо число. Ако няма нито една комбинация отговаряща на условието се печата съобщение, че не е намерено.

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        int magicnum = Integer.parseInt(scanner.nextLine());
        int count = 0;

        boolean flag = false;

        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                count++;


                if (i + j == magicnum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicnum);
                    flag = true;
                    return;
                }

            }
        }

        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", count, magicnum);
        }
    }
}
