import java.util.Scanner;

public class RadianToDegrees {
    public static void main(String[] args) {

        //чете ъгъл в радиани (десетично число) и го преобразува в градуси
        //формулата: градус = радиан * 180 / π
        Scanner scanner = new Scanner(System.in);

        //въвеждане ъгъл в радиани (десетично число)

        double radians = Double.parseDouble(scanner.nextLine());
        //Преобразуване в градуси
        //формулата: градус = радиан * 180 / π
        double degrees = radians * 180 / Math.PI;

        //принтиране
        System.out.println(degrees);
    }
}
