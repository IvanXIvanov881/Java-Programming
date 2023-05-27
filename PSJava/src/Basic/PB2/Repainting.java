import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {


    //изчислява разходите за ремонта

    //Вход
    //1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
    //2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
    //3. Количество разредител (в литри) - цяло число в интервала [1…30]
    //4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

    Scanner scanner = new Scanner(System.in);

    int Nylon = Integer.parseInt(scanner.nextLine());
    int Paint = Integer.parseInt(scanner.nextLine());
    int Agent = Integer.parseInt(scanner.nextLine());
    int Hours = Integer.parseInt(scanner.nextLine());


    //Предпазен найлон - 1.50 лв. за кв. метър
    //Боя - 14.50 лв. за литър
    //Разредител за боя - 5.00 лв. за литър
    //торбичка 0.40лв.
    //заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
    //+добави още 10% от количеството боя и 2 кв.м. найлон

    double Nylonprice = (Nylon + 2) * 1.50;
    double Paintprice = (Paint + (Paint * 10 / 100)) * 14.50;
    double Agentprice = Agent * 5.00;
    double Bag = 0.40;
    double All = Nylonprice + Paintprice + Agentprice + Bag;
    double Hoursprice = All - (All * 70 / 100);
    double Workers = Hours * Hoursprice;

    double total = All + Workers;


    //Изход
    //Да се отпечата на конзолата един ред:
    //"{сумата на всички разходи}"

    System.out.printf("{Сумата на всички разходи}" + total);

    }
}
