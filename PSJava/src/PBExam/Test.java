import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //От конзолата се четат 4 числа:
        // Първи ред – брой ролки опаковъчна хартия - цяло число в интервала [0...100]
        // Втори ред – брой ролки плат - цяло число в интервала [0...100]
        // Трети ред – литри лепило - реално число в интервала [0.00…50.00]
        // Четвърти ред – процент намаление - цяло число в интервала [0...100]
// Опаковъчна хартия - 5.80 лв. за ролка
// Плат - 7.20 лв. за ролка
// Лепило - 1.20 лв. за литър


        int rolki = Integer.parseInt(scanner.nextLine());
        int plat = Integer.parseInt(scanner.nextLine());
        double lepilo = Double.parseDouble(scanner.nextLine());
        int procent = Integer.parseInt(scanner.nextLine());

        double rolkitotal = rolki * 5.80;
        double plattotal = plat * 7.20;
        double lepilototal = lepilo * 1.20;

        double totalmateriali = rolkitotal + plattotal + lepilototal;
      double total = totalmateriali - (totalmateriali * procent / 100);
        System.out.printf("%.3f",total);
    }
}
