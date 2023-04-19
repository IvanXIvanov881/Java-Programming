import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //В града има тайна врата, за която всички знаят, но никой не е успявал да я отключи и да види какво има зад нея.
        // За да бъде отключена трябва да се въведе трицифрен код.
        //Напишете програма, която генерира комбинации спрямо въведени числа – предположения от потребителя.
        // От конзолата се въвеждат три цифри. Тези цифри ще бъдат горната граница, до която ние искаме да получим всички трицифрени числа,
        // на които всяка една цифра отговаря на следните условия:
        //Цифрата на единиците и цифрата на стотиците трябва да бъде четна
        //Цифрата на десетиците да бъде просто число в диапазона (2...7).
        //Това ще са възможните комбинации според въведените предположения от потребителя, с които ще може евентуално да се отключи вратата.


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        int first=0;
        int second=0;
        int thirt=0;

        for (int i = 1; i<=num1; i++){
            for (int j = 1; j<=num2; j++){
                for (int k = 1; k<=num3; k++) {



                    if ( i % 2 == 0 && k % 2 == 0 && (j==2 || j==3 || j==5 || j==7)) {
                        first = i;
                        second = j;
                        thirt = k;
                        System.out.printf("%d %d %d\n",first,second,thirt);
                    }

                }
            }
        }

    }
}
