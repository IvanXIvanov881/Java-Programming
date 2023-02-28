import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        //Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена математическа операция с тях.
        // Възможните операции са: Събиране (+), Изваждане (-), Умножение (*), Деление (/) и Деление с остатък (%).
        // При събиране, изваждане и умножение на конзолата трябва да се отпечата резултатът и дали той е четен или нечетен

        // При обикновеното деление – резултатът.
        // При модулното деление – остатъка.
        // Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
        // В този случай трябва да се отпечата специално съобщениe.

        //Изход
        //Да се отпечата на конзолата един ред:
        //· Ако операцията е събиране, изваждане или умножение:
        //o "{N1} {оператор} {N2} = {резултат} – {even/odd}"
        //· Ако операцията е деление:
        //o "{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
        //· Ако операцията е деление с остатък:
        //o "{N1} % {N2} = {остатък}"
        //· В случай на деление с 0 (нула):
        //o "Cannot divide {N1} by zero"

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();


        if (operator.equals("+")) {
            int resultplus = num1 + num2;

            if (resultplus % 2 == 0) {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultplus + " - even");
            } else {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultplus + " - odd");
            }
        }

        if (operator.equals("-")) {
            int resultminus = num1 - num2;

            if (resultminus % 2 == 0) {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultminus + " - even");
            } else {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultminus + " - odd");
            }
        }

        if (operator.equals("*")) {
            int resultplus = num1 * num2;
            boolean isValid = resultplus % 2 == 0;

            if (isValid) {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultplus + " - even");
            } else {
                System.out.printf(num1 + " " + operator + " " + num2 + " = " + resultplus + " - odd");
            }
        }

        if (operator.equals("/") && (num2 != 0)) {
            double divide = (double) num1 / num2;
            System.out.printf(num1 + " " + operator + " " + num2 + " = %.2f", divide);
        } else if (operator.equals("/") && (num2 == 0)) {
            System.out.printf("Cannot divide " + num1 + " by zero");
        }

        if (operator.equals("%") && (num2 != 0)) {
            int result = num1 % num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        } else if (operator.equals("%") && (num2 == 0)) {
            System.out.printf("Cannot divide " + num1 + " by zero");
        }



    }
}
