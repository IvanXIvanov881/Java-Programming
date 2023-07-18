import java.util.Scanner;

public class LoginREVERSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        StringBuilder sb = new StringBuilder(user);
        String reversedUser = sb.reverse().toString();

        int count = 0;
        for (int i = 0; i <= 4; i++) {

            String input = scanner.nextLine();

            if (count == 3) {
                System.out.printf("User %s blocked!%n", user);
                break;
            }

            if (input.equals(reversedUser)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                System.out.printf("Incorrect password. Try again.%n");
                count++;
            }






        }


    }
}
