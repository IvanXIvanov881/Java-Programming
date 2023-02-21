
import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //конзолата прочита от конзолата име, фамилия, възраст и град
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        //печата следното съобщение: "You are <firstName> <lastName>, a <age>-years old person from <town>.
        System.out.println("You are " + firstname + " " + lastname + ", a " + age + "-years old person from " + town + ".");


    }
}
