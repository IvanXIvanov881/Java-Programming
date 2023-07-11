import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int correctnum = number % 10;

        String word = "";

        if (correctnum == 0) {
            word = "zero";
        } else if (correctnum == 1) {
            word = "one";
        } else if (correctnum == 2) {
            word = "two";
        } else if (correctnum == 3) {
            word = "three";
        } else if (correctnum == 4) {
            word = "four";
        } else if (correctnum == 5) {
            word = "five";
        } else if (correctnum == 6) {
            word = "six";
        } else if (correctnum == 7) {
            word = "seven";
        } else if (correctnum == 8) {
            word = "eight";
        } else if (correctnum == 9) {
            word = "nine";
        }


        System.out.println(word);

    }
}
