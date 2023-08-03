import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int top = 0;
        int second = 0;
        int three = 0;

        if (num1 >= num2 && num1 >= num3) {
            top = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            top = num2;
        } else if (num3 >= num1 && num3 >= num2) {
            top = num3;
        }

        if (num1 >= num2 && num1 <= num3) {
            second = num1;
        } else if (num2 >= num1 && num2 <= num3) {
            second = num2;
        } else if (num3 >= num1 && num3 <= num2) {
            second = num3;

        } else if (num1 <= num2 && num1 >= num3) {
            second = num1;
        } else if (num2 <= num1 && num2 >= num3) {
            second = num2;
        } else if (num3 <= num1 && num3 >= num2) {
            second = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            three = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            three = num2;
        } else if (num3 <= num1 && num3 <= num2) {
            three = num3;
        }

        System.out.println(top);
        System.out.println(second);
        System.out.println(three);

    }
}
