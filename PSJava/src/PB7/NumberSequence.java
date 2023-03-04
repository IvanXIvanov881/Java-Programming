import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        //Напишете програма, която чете n на брой цели числа. Принтирайте най-голямото и най-малкото число сред въведените.

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;
        for (int i = 1; i <= n ; i++) {
            int currectnum = Integer.parseInt(scanner.nextLine());

            if (currectnum > maxnum) {
                maxnum = currectnum;
            }
            if (currectnum < minnum) {
                minnum = currectnum;
            }

        }
        System.out.printf("Max number: %d%n",maxnum);
        System.out.printf("Min number: %d",minnum);
    }
}
