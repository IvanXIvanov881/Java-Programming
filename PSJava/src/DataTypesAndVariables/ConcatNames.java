import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String contanct = scanner.nextLine();

        System.out.println(firstName + contanct + secondName);
    }
}
