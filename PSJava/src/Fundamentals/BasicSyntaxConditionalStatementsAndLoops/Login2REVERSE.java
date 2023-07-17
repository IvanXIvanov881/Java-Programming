import java.util.Scanner;

public class Login2REVERSE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {

            char symbol = username.charAt(i);

            password += symbol;

        }


        int count = 0;
        for (int i = 0; i <= 4; i++) {

            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            }

            if (count == 3) {
                System.out.printf("User %s blocked!%n", username);
                break;
            }

            if (!input.equals(password)) {
                System.out.printf("Incorrect password. Try again.%n");
                count++;
            }

        }


    }
}
