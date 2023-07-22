import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sms = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 1; i <= sms; i++) {

            int input = Integer.parseInt(scanner.nextLine());

            if (input == 2) {
                char letter = 'a';
                message += letter;
            } else if (input == 22) {
                char letter = 'b';
                message += letter;
            } else if (input == 222) {
                char letter = 'c';
                message += letter;
            } else if (input == 3) {
                char letter = 'd';
                message += letter;
            } else if (input == 33) {
                char letter = 'e';
                message += letter;
            } else if (input == 333) {
                char letter = 'f';
                message += letter;
            } else if (input == 4) {
                char letter = 'g';
                message += letter;
            } else if (input == 44) {
                char letter = 'h';
                message += letter;
            } else if (input == 444) {
                char letter = 'i';
                message += letter;
            } else if (input == 5) {
                char letter = 'j';
                message += letter;
            } else if (input == 55) {
                char letter = 'k';
                message += letter;
            } else if (input == 555) {
                char letter = 'l';
                message += letter;
            } else if (input == 6) {
                char letter = 'm';
                message += letter;
            } else if (input == 66) {
                char letter = 'n';
                message += letter;
            } else if (input == 666) {
                char letter = 'o';
                message += letter;
            } else if (input == 7) {
                char letter = 'p';
                message += letter;
            } else if (input == 77) {
                char letter = 'q';
                message += letter;
            } else if (input == 777) {
                char letter = 'r';
                message += letter;
            } else if (input == 7777) {
                char letter = 's';
                message += letter;
            } else if (input == 8) {
                char letter = 't';
                message += letter;
            } else if (input == 88) {
                char letter = 'u';
                message += letter;
            } else if (input == 888) {
                char letter = 'v';
                message += letter;
            } else if (input == 9) {
                char letter = 'w';
                message += letter;
            } else if (input == 99) {
                char letter = 'x';
                message += letter;
            } else if (input == 999) {
                char letter = 'y';
                message += letter;
            } else if (input == 9999) {
                char letter = 'z';
                message += letter;
            } else if (input == 0) {
                char letter = ' ';
                message += letter;
            }

        }

        System.out.println(message);

    }
}