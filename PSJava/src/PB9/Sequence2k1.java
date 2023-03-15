import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете число n, въведено от потребителя,
        // и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, …. Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.

        int n = Integer.parseInt(scanner.nextLine());

        int currentnum = 1;


        while (currentnum <= n) {

            System.out.println(currentnum);
            currentnum = currentnum * 2 + 1;


        }

    }
}

