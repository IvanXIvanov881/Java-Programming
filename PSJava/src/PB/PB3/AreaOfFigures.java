import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        //програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята лицето й
        //Фигурите са четири вида:
        //квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle)

        //На първия ред на входа се чете вида на фигурата
        // (текст със следните възможности: square, rectangle, circle или triangle)

        //· Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        // S = a.a
        //· Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //S = a.b
        //· Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //S = PI * r * r
        //· Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        //S = (b*h)/2
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double s = a * a;
            System.out.printf("%.3f", s);
        } else if (type.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double s = a * b;
            System.out.printf("%.3f", s);
        } else if (type.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double s = Math.PI * r * r;
            System.out.printf("%.3f", s);
        } else if (type.equals("triangle")) {
            double b = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double s = (b * h) / 2;
            System.out.printf("%.3f", s);
        }


        }
    }
