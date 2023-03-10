import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която пресмята колко общо пари има в сметката, след като направите определен брой вноски.

        //На всеки ред ще получавате сумата, която трябва да внесете в сметката, до получаване на команда "NoMoreMoney ".

        //При всяка получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
        // Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата да приключи.
        // Когато програмата приключи трябва да се принтира "Total: " + общата сума в сметката форматирана до втория знак след десетичната запетая.



        double balance = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f",balance);
                break;
            }

            double money = Double.parseDouble(input);

            if (money < 0){
                System.out.printf("Invalid operation!%n");
                System.out.printf("Total: %.2f",balance);
                break;
            }

            balance = balance + money;
            System.out.printf("Increase: %.2f%n", money);


        }
    }
}
