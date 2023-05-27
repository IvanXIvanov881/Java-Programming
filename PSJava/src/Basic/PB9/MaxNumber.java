import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int number = Integer.MIN_VALUE;
int correctnum = 0;

        while (true) {

            String n = scanner.nextLine();

            if (n.equals("Stop")){
                break;
            }

            correctnum = Integer.parseInt(n);

            if (number < correctnum) {
                number = correctnum;

            }


        }

        System.out.println(number);


    }
}
