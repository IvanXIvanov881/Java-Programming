import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int[] numbers = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] tempNumb = new int[numbers.length];
        for (int j = 0; j < tempNumb.length; j++) {
            tempNumb[j] = numbers[j];



        }


        String text ="ISTANBUL And NEW YORK And PARIS Or TOKYO And MOSCOW";
        String[] cities = text.split("And|Or");

        for (int i = 0;i<cities.length;i++){
            System.out.printf("%s",cities[i]);
        }


    }
}



//запетая след всяко с if проверка в цикъла . Когатo i == numbersArr.lenght - 1 System.out.print (numbersArr[i]).