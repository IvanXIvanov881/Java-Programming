
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Моля въведете брой?");

        //една опаковка храна за кучета е на цена 2.50 лв.
        double dog = Double.parseDouble(scanner.nextLine());
        double resultdog = dog * 2.50;
        //една опаковка храна за котки струва 4 лв.
        double cat = Double.parseDouble(scanner.nextLine());
        double resultcat = cat * 4;

        System.out.println(resultdog + resultcat);


    }
}
