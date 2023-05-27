import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа,
        // докато тяхната сума стане по-голяма или равна на първоначалното число. След приключване на четенето да се отпечата сумата на въведените числа.

        int number = Integer.parseInt(scanner.nextLine());

        int num = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            num = num + input;
            if (number <= num) {


                System.out.println(num);
                break;
            }

        }

    }
}
