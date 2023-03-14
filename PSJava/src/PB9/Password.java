import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String username = scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {
            String password1 = scanner.nextLine();
            if (password1.equals(password)) {
               System.out.printf("Welcome %s!", username);
               break;
            }
        }
    }
}
