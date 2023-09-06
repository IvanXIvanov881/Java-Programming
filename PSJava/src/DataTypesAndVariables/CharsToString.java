import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char input1 = scanner.next().charAt(0);
        char input2 = scanner.next().charAt(0);
        char input3 = scanner.next().charAt(0);

        String text = "" + input1 + input2 + input3;


        System.out.println(text);
    }
}
