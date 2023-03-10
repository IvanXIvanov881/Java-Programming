import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //В кутия имаме неопределен брой топки с различни цветове, които ни носят различен брой точки.

        //Задачата ни е да извадим Х бр. топки, които ще бъдат въведени от конзолата, като се има в предвид,
        // че всеки различен цвят влияе на точките ни по следния начин:

        //Ако топката е “red” точките ни се повишават с 5.
        //Ако топката е “orange” точките ни се повишават с 10.
        //Ако топката е “yellow” точките ни се повишават с 15.
        //Ако топката е “white” точките ни се повишават с 20.
        //Ако топката е “black” точките ни се делят на 2, като закръгляме към по-малкото цяло число.

        //Ако топката е с какъвто и да е цвят, различен от по-горните, точките не се манипулират и програмата продължава да работи.

        //Вход:
        //От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
        //След това се четат N на брой цветове.

        //Изход:
        //Отпечатват се следните редове:
        //"Total points: {всичките събрани точки}"
        //"Red balls: {броят червени топки}"
        //"Orange balls: {броят оранжеви топки}"
        //"Yellow balls: {броят жълти топки}"
        //"White balls: {броят бели топки}"
        //"Other colors picked: {броят на избраните топки извън зададените цветове}"
        //"Divides from black balls: {броят на пътите, в които точките са били разделяни на 2}"


        int numballs = Integer.parseInt(scanner.nextLine());

        double red = 0;
        double orange = 0;
        double yellow = 0;
        double white = 0;
        double black = 0;
        double other = 0;
        double totalpoints = 0;

        for (int i = 1; i <= numballs; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                red = red + 1;
                totalpoints = totalpoints + 5;
            } else if (color.equals("orange")) {
                orange = orange + 1;
                totalpoints = totalpoints + 10;
            } else if (color.equals("yellow")) {
                yellow = yellow + 1;
                totalpoints = totalpoints + 15;
            } else if (color.equals("white")) {
                white = white + 1;
                totalpoints = totalpoints + 20;
            } else if (color.equals("black")) {
                black = black + 1;
                totalpoints = Math.floor(totalpoints / 2);
            } else {
                other = other + 1;
            }

        }

        System.out.printf("Total points: %.0f%n",totalpoints);
        System.out.printf("Red balls: %.0f%n", red);
        System.out.printf("Orange balls: %.0f%n", orange);
        System.out.printf("Yellow balls: %.0f%n", yellow);
        System.out.printf("White balls: %.0f%n", white);
        System.out.printf("Other colors picked: %.0f%n", other);
        System.out.printf("Divides from black balls: %.0f%n", black);




    }
}
