import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        //програма, която чете от конзолата страна и височина на триъгълник и пресмята неговото лице.

        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());


        //формулата за лице на триъгълник: area = a * h / 2.

        double area = a * h / 2;

        //Форматирате изхода до втория знак след десетичната запетая.

        System.out.printf("%.2f", area);


    }

}
