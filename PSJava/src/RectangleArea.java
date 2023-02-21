package Lab;

import java.util.Scanner;

public class RectangleArea {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Прочитане на входни данни от конзола
        //Станите на правоъгълника a и b

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        // обработка на данните (Аритметични операции)
        int area = a * b;

        // принтиране на резултата
        System.out.println(area);
    }
}
