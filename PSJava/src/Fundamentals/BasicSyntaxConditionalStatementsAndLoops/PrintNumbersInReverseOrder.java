import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numbersArr = new int[Integer.parseInt(scanner.nextLine())];


       for (int i = numbersArr.length-1; i >= 0; --i) {
           int nums = Integer.parseInt(scanner.nextLine());
           numbersArr[i] = nums;

       }

       for (int j = 0; j < numbersArr.length; j++){
           System.out.printf("%d ", numbersArr[j]);
       }



    }


}
