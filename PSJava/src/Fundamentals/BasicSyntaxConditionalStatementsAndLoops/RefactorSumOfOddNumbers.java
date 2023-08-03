import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int num = 0;
        for (int i = 0; i <= n * 2 ; i++) {

            if(i % 2 != 0){
                System.out.println(i);
                num = num + i;
            }
        }
        System.out.println("Sum: " + num);

    }
}
