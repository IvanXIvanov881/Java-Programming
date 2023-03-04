import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете текст (стринг), въведен от потребителя, изчислява и отпечатва сумата от
        // стойностите на гласните букви според таблицата по-долу:
        //буква    a e i o u
        //стойност 1 2 3 4 5
        String inPut = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < inPut.length(); i++) {
            char symbol = inPut.charAt(i);

            switch (symbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;

            }
        }
System.out.println(sum);

    }
}
