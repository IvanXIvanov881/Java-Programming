import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            int inPutNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + inPutNumber;
        }

        System.out.println(sum);
    }
}
