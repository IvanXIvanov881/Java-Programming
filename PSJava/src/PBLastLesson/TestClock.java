import java.util.Scanner;

public class TestClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j<= 59; j++) {
                for (int l = 0; l <= 59; l++) {

                    System.out.printf("%02d:%02d:%02d%n", i, j, l);
                }
            }
        }
    }
}
