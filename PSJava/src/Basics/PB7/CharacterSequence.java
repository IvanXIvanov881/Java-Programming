import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {


        //Напишете програма, която чете текст (стринг), въведен от потребителя и печата всеки символ от текста на отделен ред.


        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int langthText = text.length();

        for (int i = 0; i < langthText; i++) {
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }
    }
}
