import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която отпечатва часовете в денонощието от 0:0 до 23:59, всеки на отделен ред.
        // Часовете трябва да се изписват във формат "{час}:{минути}".

        for (int i = 0; i <=23; i++){
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%02d:%02d%n", i, j);
            }
        }
    }
}
