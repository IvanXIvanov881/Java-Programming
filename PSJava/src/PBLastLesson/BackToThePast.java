import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Иванчо е на 18 години и получава наследство, което се състои от X сума пари и машина на времето.
        // Той решава да се върне до 1800 година, но не знае дали парите ще са достатъчни, за да живее без да работи.
        // Напишете програма, която пресмята, дали Иванчо ще има достатъчно пари, за да не се налага да работи до дадена година включително.
        // Като приемем, че за всяка четна (1800, 1802 и т.н.)
        // година ще харчи 12 000 лева. За всяка нечетна (1801,1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].


        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int ivanyears = 18;

        for (int i = 0; i <= year - 1800; i++) {




            if (i % 2 == 0) {
                money = money - 12000;
            } else {
                money = money - (12000 + (50 * ivanyears));
            }
            ivanyears+=1;

        }
        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }

    }
}
