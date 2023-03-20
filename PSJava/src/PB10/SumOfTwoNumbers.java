import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа.
        // На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
        // Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.


        //Вход
        //Входът се чете от конзолата и се състои от три реда:
        //· Първи ред – начало на интервала – цяло число в интервала [1...999]
        //· Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
        //· Трети ред – магическото число – цяло число в интервала [1...10000]

        //Изход

        //На конзолата трябва да се отпечата един ред, според резултата:
        //· Ако е намерена комбинация чиито сбор на числата е равен на магическото число
        //o "Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
        //· Ако не е намерена комбинация отговаряща на условието
        //o "{броят на всички комбинации} combinations - neither equals {магическото число}"

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicnum = Integer.parseInt(scanner.nextLine());


        boolean isValidComb = false;
        int count = 0;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                count++;
                int sum = i + j;
                if (sum == magicnum) {
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)", i, j, magicnum);
                    isValidComb = true;
                    break;
                }
            }
            if(isValidComb) {
                break;
            }
        }

        if(!isValidComb) {
            System.out.printf("%d combinations - neither equals %d",count,magicnum);
        }
    }
}
