import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {

        //чете от конзолата три дробни числа b1, b2 и h и пресмята лицето на трапец с основи b1 и b2 и височина h
        Scanner scanner = new Scanner (System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());


        //Формулата за лице на трапец е (b1 + b2) * h / 2.
        double total = (b1 + b2) * h/2;


        //Изход: Отговорът трябва да е форматиран до втората цифра след десетичния знак.

      System.out.printf("%.2f",total);

    }
}
