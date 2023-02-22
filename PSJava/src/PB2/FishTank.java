import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        //Първоначално прочитаме от конзолата на отделни редове размерите му:
        // – дължина, широчина и височина в сантиметри

        //Трябва да се пресметне колко литра вода ще събира аквариума, ако се знае,
        // че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.

        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.

        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.

        //Вход
        //От конзолата се четат 4 реда:
        //1. Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – реално число в интервала [0.000 … 100.000]

        Scanner scanner = new Scanner(System.in);

        int dulug = Integer.parseInt(scanner.nextLine());
        int shirok = Integer.parseInt(scanner.nextLine());
        int visok = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double obem = dulug * shirok * visok;
        double vmestimost = obem / 1000;
        double total = vmestimost - (vmestimost * procent / 100);


        //Изход
        //Да се отпечата на конзолата едно число:
        //· литрите вода, които ще събира аквариума.

        System.out.println(total);




    }
}
