import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        //Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50)

        //Да се напише програма, която чете времената на състезателите в секунди, въведени от потребителя и пресмята сумарното им време във формат "минути:секунди"
        //Секундите да се изведат с водеща нула (2 à "02", 7 à "07", 35 à "35").

        Scanner scanner = new Scanner(System.in);
        int seconds1 = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());

        int total = seconds1 + seconds2 + seconds3;

        int minutes = total / 60;
        int sec = total % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d",minutes, sec);
        } else  {
            System.out.printf("%d:%d",minutes,sec);
        }



    }
}
