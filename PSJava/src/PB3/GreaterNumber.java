import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        //Да се напише програма, която чете две цели числа, въведени от потребителя и отпечатва по-голямото от двете.
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }}
