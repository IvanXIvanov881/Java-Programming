import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String input = scanner.nextLine();

        String reversedword = "";

        for (int i = input.length()-1; i>=0; i--){

            char ofString = input.charAt(i);

            reversedword += ofString;
        }

        System.out.println(reversedword);
    }
}
