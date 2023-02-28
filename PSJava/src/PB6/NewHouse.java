package ThirdWeekExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        String flowersKind = scanner.nextLine();

        //Брой цветя - цяло число в интервала [10…1000]
        double flowersNum = Double.parseDouble(scanner.nextLine());

        //Бюджет - цяло число в интервала [50…2500]
        double budget = Double.parseDouble(scanner.nextLine());

        //Променливи
        double rosePrice = 5;
        double daliaPrice = 3.80;
        double lalePrice = 2.80;
        double narcisPrice = 3;
        double gladiolaPrice = 2.50;
        double total = 0.0;


        //Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        if ("Roses".equals(flowersKind)) {
            total = flowersNum * rosePrice;
            if (flowersNum > 80) {
                total = 0.9 * total;
            }
        }

        //· Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
        else if ("Dahlias".equals(flowersKind)) {
            total = flowersNum * daliaPrice;
            if (flowersNum > 90) {
                total = 0.85 * total;
            }
        }

        //Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        else if ("Tulips".equals(flowersKind)) {
            total = flowersNum * lalePrice;
            if (flowersNum > 80) {
                total = 0.85 * total;
            }
        }

        //Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        else if ("Narcissus".equals(flowersKind)) {
            total = flowersNum * narcisPrice;
            if (flowersNum < 120) {
                total = 1.15 * total;
            }
        }

        //Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        else if ("Gladiolus".equals(flowersKind)) {
            total = flowersNum * gladiolaPrice;
            if (flowersNum < 80) {
                total = 1.20 * total;
            }
        }

        //Да се отпечата:
        //Ако бюджета им е достатъчен
        if (total <= budget) {
            double left = budget - total;
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", flowersNum, flowersKind, left);
        }

        //Ако бюджета им е НЕ достатъчен
        else {
            double needed = total - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }
        //


    }
}