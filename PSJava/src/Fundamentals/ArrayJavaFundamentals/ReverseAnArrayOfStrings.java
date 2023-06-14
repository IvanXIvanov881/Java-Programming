import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sym = scanner.nextLine();

        String[] symbolArr = sym.split(" ");

        for (int i = symbolArr.length-1; i >= 0; --i) {

                    System.out.printf("%s ", symbolArr[i]);


        }

    }
}
