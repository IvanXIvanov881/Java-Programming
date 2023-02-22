import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        //изчислява каква сума ще получите в края на депозитния период при определен лихвен процент
        Scanner scanner = new Scanner(System.in);
        //депозитна сума
        double deposit = Double.parseDouble(scanner.nextLine());
        //депозитния период
        int time = Integer.parseInt(scanner.nextLine());
        //лихвен процент
        double procent = Double.parseDouble(scanner.nextLine()) * 0.01;


        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sum = deposit + time * ((deposit * procent) / 12);
        //крайна сума
        System.out.println(sum);
    }
}
