import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int firstnum = Integer.parseInt(scanner.nextLine());
        int secondnum = Integer.parseInt(scanner.nextLine());

        int total = 0;

        for (int i = firstnum; i <= secondnum; i++) {

            total = total + i;

            System.out.printf("%d ", i);

        }

        System.out.printf("%nSum: %d", total);


    }
}
