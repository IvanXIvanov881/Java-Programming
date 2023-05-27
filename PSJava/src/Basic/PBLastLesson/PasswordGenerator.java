import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете две цели числа n и l, въведени от потребителя, и генерира по азбучен ред всички възможни
        // пароли, които се състоят от следните 5 символа:


        //Символ 1: цифра от 1 до n.
        //Символ 2: цифра от 1 до n.
        //Символ 3: малка буква измежду първите l букви на латинската азбука.
        //Символ 4: малка буква измежду първите l букви на латинската азбука.
        //Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.

        //Вход
        //Входът се чете от конзолата и се състои от две цели числа n и l в интервала [1…9], по едно на ред.

        //Изход
        //На конзолата трябва да се отпечатат всички пароли по азбучен ред, разделени с интервал.

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < l; k++) {
                    for (int g = 0; g < l; g++) {
                        for (int h = 1; h <= n; h++) {

                            String abc = "abcdefghijklmnopqrstuvwxyz";

                            char k1 = abc.charAt(k);
                            char g1 = abc.charAt(g);


                            if (h > i && h > j) {
                                System.out.printf("%d%d%s%s%d ", i, j, k1, g1, h);
                            }
                        }
                    }
                }
            }
        }

    }
}
