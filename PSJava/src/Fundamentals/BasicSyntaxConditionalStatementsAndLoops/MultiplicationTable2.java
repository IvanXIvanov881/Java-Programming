import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int product = num * times;

        System.out.printf("%d X %d = %d\n", num, times, product);

        while (true) {
            times++;
int secproduct = num * times;
            if (times > 10) {
                break;
            } else {
                System.out.printf("%d X %d = %d\n", num, times, secproduct);

            }

        }
    }
}