import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        //Дадено е цяло число – начален брой точки, Върху него се начисляват бонус точки по правилата, описани по-долу
        //програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).

        //· Ако числото е до 100 включително, бонус точките са 5.
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.

        //о Допълнителни бонус точки (начисляват се отделно от предходните):
        //o За четно число -> + 1 т.
        //o За число, което завършва на 5 -> + 2 т.

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0;


        if (start <= 100) {
            bonus = 5;
        } else if (start > 1000) {
            bonus = start * 0.1;
        } else {
            bonus = start * 0.2;
        }

        if (start % 2 == 0) {
            bonus = bonus + 1;
        } else if (start % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(start+bonus);
    }
}
