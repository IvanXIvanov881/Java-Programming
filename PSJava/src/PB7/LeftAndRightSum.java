import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете 2 * n-на брой цели числа, подадени от потребителя, и проверява дали сумата на първите n числа (лява сума)
        // е равна на сумата на вторите n числа (дясна сума).

        // При равенство печата " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата.
        // Разликата се изчислява като положително число (по абсолютна стойност).


        int n = Integer.parseInt(scanner.nextLine());





        int n1sum = 0;
        int n2sum = 0;

        for (int i = 1; i <= n; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            n1sum = n1sum + n1;

        }
        for (int i = 1; i <= n; i++) {
            int n2 = Integer.parseInt(scanner.nextLine());
            n2sum = n2sum + n2;

        }


        if (n1sum == n2sum) {
            int diff = n1sum + n2sum;
            System.out.printf("Yes, sum = " + n1sum);
        } else if (n1sum != n2sum) {
            int diff = Math.abs(n1sum - n2sum);
            System.out.printf("No, diff = " + diff);
        }


    }
}
