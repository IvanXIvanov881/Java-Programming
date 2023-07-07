import java.util.Scanner;

public class Backin30MinutesTIME {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allminute = (hours * 60) + minutes + 30;

        int correcthours = allminute / 60;
        int correctminutes = allminute % 60;

        if (correcthours > 23) {
            correcthours = 0;

        }

        System.out.printf("%d:%02d",correcthours,correctminutes);

    }

}
