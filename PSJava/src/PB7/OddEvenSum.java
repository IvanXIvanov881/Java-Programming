import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете n-на брой цели числа, подадени от потребителя и
        //проверява дали сумата от числата на четни позиции е равна на сумата на числата на нечетни позиции.

        int num = Integer.parseInt(scanner.nextLine());

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= num; i++){
            int countinmput = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                odd = odd + countinmput;
            } else if (i % 2 != 0) {
                even = even + countinmput;
            }
        }




        if (odd == even){
            int totalodd = odd - even;
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d",odd);
        } else {
            int totaleven = Math.abs(even-odd);
            System.out.printf("No%n");
            System.out.printf("Diff = %d",totaleven);

        }
    }
}
