import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //За да предотврати това, той въвежда изненадващи проверки на отворените табове на браузъра на служителите си.
        //Според отворения сайт в таба се налагат следните глоби:
        //
        //· "Facebook" -> 150 лв.
        //· "Instagram" -> 100 лв.
        //· "Reddit" -> 50 лв.

        //От конзолата се четат два реда:
        //· Брой отворени табове в браузъра n - цяло число в интервала [1...10]
        //· Заплата - число в интервала [500...1500]
        //След това n – на брой пъти се чете име на уебсайт – текст

        //Изход
        //· Ако по време на проверката заплатата стане по-малка или равна на 0 лева, на конзолата се изписва "You have lost your salary." и програмата приключва.
        //· В противен случай след проверката на конзолата се изписва остатъкът от заплатата (да се изпише като цяло число).


        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        double totalminus = 0;


        for (int i = 1; i <= tabs; i++) {
            String site = scanner.nextLine();


            if (site.equals("Facebook")) {
                totalminus = totalminus + 150;
            } else if (site.equals("Instagram")) {
                totalminus = totalminus + 100;
            } else if (site.equals("Reddit")) {
                totalminus = totalminus + 50;
            }

            if (salary - totalminus <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }


        }

        if (salary - totalminus > 0) {
            double total = salary - totalminus;
            System.out.printf("%.0f", total);
        }


    }
}