import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Имаме банкноти и монети по 1лв., по 2лв. и по 5лв. Да се напише програма, която прочита въведените
        // от потребителя брой банкноти и монети и сума, и извежда на екран всички възможни начини по които сумата може
        // да се изплати с наличните банкноти.

        //Вход
        //Входът се чете от конзолата и съдържа точно 4 реда:
        //Брой монети по 1лв. - цяло положително число;
        //Брой монети по 2лв. - цяло положително число;
        //Брой банкноти по 5лв. - цяло положително число;
        //Сума - цяло положително число в интервала [1…1000];

        //Изход
        //Да се отпечатат на конзолата всички комбинации от дадените номинали, образуващи сумата, форматирани по следния начин:
        //"{бр. 1лв.} * 1 lv. + {бр. 2лв.} * 2 lv. + {бр. 5лв.} * 5 lv. = {сума} lv."


        int coins1 = Integer.parseInt(scanner.nextLine());
        int coins2 = Integer.parseInt(scanner.nextLine());
        int paper5 = Integer.parseInt(scanner.nextLine());
        int total = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<=coins1; i++){
            for (int j = 0; j<=coins2; j++){
                for (int k = 0; k<=paper5; k++){

                    if (i * 1 + j * 2 + k * 5 == total) {

                    System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,total);

                    }
                }
            }
        }


    }
}
