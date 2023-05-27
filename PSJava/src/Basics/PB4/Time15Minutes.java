import java.util.Scanner;

public class Time15Minutes {

    public static void main(String args[]) {


        //да се напише програма която, чете час и минути от 24 часово денонощие

        //изчислява колко ще е часът след 15 минути

        // да се отпречата часове минути

        // часовете винаги са между 0 и 23

        // минутите винаги са между 0 и 59

        // часовете с 1 или 2 цифри

        // минутите с 0 отпред

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());

        int minute = Integer.parseInt(scanner.nextLine());

        int minutes = minute + 15;


        if (minutes > 59) {
            hour = hour + (minutes / 60);
            minutes = minutes % 60;
        }

        if (hour > 23) {
            hour = 0;
        } else if (hour >= 1) {
            hour = hour;
        }


        if (minutes < 10) {
            System.out.printf("%d" + ":" + "0%d", hour, minutes);
        } else {
            System.out.printf("%d" + ":" + "%d", hour, minutes);
        }


    }
}

