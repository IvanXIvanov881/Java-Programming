import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {

        //Лято е с много променливо време и Виктор има нужда от вашата помощ.
        // Напишете програма която спрямо времето от денонощието и градусите да препоръча на Виктор какви дрехи да си облече.

        //Вашия приятел има различни планове за всеки етап от деня, които изискват и различен външен вид, тях може да видите от таблицата.
        //От конзолата се четат точно два реда:
        //· Градусите - цяло число в интервала [10…42]
        //· Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"

        //Да се отпечата на конзолата на един ред: "It's {градуси} degrees, get your {облекло} and {обувки}."

        Scanner scanner = new Scanner(System.in);

        int graduse = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        if (10 <= graduse && 18 >= graduse) {
            if (time.equals("Morning")) {
                System.out.printf("It's " + graduse + " degrees, get your Sweatshirt and Sneakers.");
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's " + graduse + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Evening")) {
                System.out.printf("It's " + graduse + " degrees, get your Shirt and Moccasins.");
            }
        } else if (18 < graduse && 24 >= graduse) {
            if (time.equals("Morning")) {
                System.out.printf("It's " + graduse + " degrees, get your Shirt and Moccasins.");
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's " + graduse + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Evening")) {
                System.out.printf("It's " + graduse + " degrees, get your Shirt and Moccasins.");
            }
        } else if (graduse > 24) {
            if (time.equals("Morning")) {
                System.out.printf("It's " + graduse + " degrees, get your T-Shirt and Sandals.");
            } else if (time.equals("Afternoon")) {
                System.out.printf("It's " + graduse + " degrees, get your Swim Suit and Barefoot.");
            } else if (time.equals("Evening")) {
                System.out.printf("It's " + graduse + " degrees, get your Shirt and Moccasins.");

            }
        }

    }

}