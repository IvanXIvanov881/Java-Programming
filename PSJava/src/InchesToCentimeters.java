import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {

        //прочитане на вход
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        // преобразуване от инчове към сантиметри
        // 1 инч = 2.54 сантиметра
        double centimeters = inches * 2.54;

        //печатане на резултата
        System.out.println(centimeters);
    }
}
