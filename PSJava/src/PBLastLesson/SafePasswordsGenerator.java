import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ани се страхува от това, да не й бъде хакнат някой от профилите в социалните мрежи, затова решава да направи генератор за пароли,
        // които да бъдат достатъчно сигурни. Вашата задача е да й помогнете да напише програма, която ще генерира тези пароли,
        // разделени една от друга от знака "|".
        //Да се напише програма, която генерира серия от символи като в шаблона:
        //ABxyBA
        //като при всяко генериране на нов код, стойностите на символите се увеличават с 1. Ако A надхвърли 55,
        // се връща на 35. Ако B надхвърли 96, се връща на 64.

        //Вход
        //От конзолата се чете 1 ред:
        //На първия ред a – цяло число в интервала [1 … 1000]
        //На втория ред b – цяло число в интервала [1 … 1000]
        //На третия ред максимален брой генерирани пароли – цяло число в интервала [1 … 1000000]
        //Ограничения:
        //A е символ с ASCII стойност в диапазона [35… 55]
        //B е символ с ASCII стойност в диапазона [64 … 96]
        //x e цяло число в диапазона [1… a]
        //y e цяло число в диапазона [1… b]
        //Изход:
        //Да се отпечата на конзолата:
        //Генерираният код. Ако броят на комбинациите е по-голям от максималния на кода,
        // да се отпечата до подадената стойност, в противен случай да се отпечата до текущия брой на комбинациите.


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maximum = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 35; i <= 56; i++) {
            for (int j = 64; j <= 97; j++) {
                for (int k = 1; k <= a; k++) {
                    for (int l = 1; l <= b; l++) {

                        if (counter >= maximum) {
                            return;
                        }

                        char ch = (char) i;
                        char ch2 = (char) j;

                        System.out.printf("%s%s%d%d%s%s", ch, ch2, k, l, ch2, ch + "|");

                        i++;
                        j++;

                        if (i > 55) {
                            i = 35;
                        }
                        if (j > 96) {
                            j = 64;
                        }

                        if (k == a && l == b) {
                            return;
                        }

                        counter++;

                    }

                }

            }

        }


    }
}
