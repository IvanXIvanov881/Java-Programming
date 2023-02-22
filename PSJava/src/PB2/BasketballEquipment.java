import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        //Вход
        //От конзолата се четe 1 ред:
        //Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        Scanner scanner = new Scanner(System.in);

        int training = Integer.parseInt(scanner.nextLine());

        //Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира.
        //знаете колко е таксата за тренировки по баскетбол за период от 1 година

        //+ Нужна екипировка
        //Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double kecove = training - (training * 40 / 100);
        double ekip = kecove - (kecove * 20 / 100);
        double ball = ekip * 1 / 4;
        double aksesoari = ball * 1 / 5;
        double total = training + kecove + ekip + ball + aksesoari;

        //Изход
        //Да се отпечата на конзолата колко ще са разходите на Джеси, ако започне да спортува баскетбол.
        System.out.println(total);

    }
}
