import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете число n, въведено от потребителя
        // и печата четните степени на 2 ≤ 2n: 20, 22, 24, 26, …, 2n.

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        System.out.println(num);
        if (n  >=2) {
        for (int i = 1; i <= n; i += 2) {
            num = num * 2 * 2;


            System.out.println(num);

        }
        }
    }
}
