import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Дадени са n цели числа в интервала [1…1000]. От тях някакъв процент p1 са под 200, друг процент p2 са от 200 до 399,
        // друг процент p3 са от 400 до 599, друг процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре.

        // Да се напише програма, която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.

        //Вход
        //
        //На първия ред от входа стои цялото число n (1 ≤ n ≤ 1000) – брой числа.
        // На следващите n реда стои по едно цяло число в интервала [1…1000] – числата върху които да бъде изчислена хистограмата.

        //Изход
        //
        //Да се отпечата на конзолата хистограмата – 5 реда, всеки от които съдържа число между 0% и 100%,
        // с точност две цифри след десетичната точка, например 25.00%, 66.67%, 57.14%.

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;



        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());


            if (num < 200) {
                p1 = p1 + 1;
            } else if (num >= 200 && num <= 399) {
                p2 = p2 + 1;
            } else if (num >= 400 && num <= 599) {
                p3 = p3 + 1;
            } else if (num >= 600 && num <= 799) {
                p4 = p4 + 1;
            } else if (num >= 800) {
                p5 = p5 + 1;
            }


        }

        double p1total = (p1 * 100 / n);
        System.out.printf("%.2f%%%n", p1total);

        double p2total = p2 * 100 / n;
        System.out.printf("%.2f%%%n", p2total);


        double p3total = p3 * 100 / n;
        System.out.printf("%.2f%%%n", p3total);

        double p4total = p4 * 100 / n;
        System.out.printf("%.2f%%%n", p4total);


        double p5total = p5 * 100 / n;
        System.out.printf("%.2f%%%n", p5total);

    }
}
