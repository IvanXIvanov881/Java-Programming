import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        //програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
        //Потърсете в Интернет подходяща формула, с която да извършите изчисленията.
        Scanner scanner = new Scanner(System.in);
        double c = Double.parseDouble(scanner.nextLine());

        //Форматирате изхода до втория знак след десетичната запетая.
        double f = c * 1.8000 + 32.00;

        //°F=°C* 1.8000+ 32.00

        System.out.printf("%.2f", f);

    }

}
