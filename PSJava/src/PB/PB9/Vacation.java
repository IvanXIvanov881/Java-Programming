import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Джеси е решила да събира пари за екскурзия и иска от вас да ѝ помогнете да разбере дали ще успее да събере необходимата сума.
        //Тя спестява или харчи част от парите си всеки ден. Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.

        //Вход
        //От конзолата се четат:
        //· Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //· Налични пари - реално число в интервала [0.00...25000.00]
        //След това многократно се четат по два реда:
        //· Вид действие - текст с възможности "spend" и "save"
        //· Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]


        //Изход
        //Програмата трябва да приключи при следните случаи:
        //· Ако 5 последователни дни Джеси само харчи, на конзолата да се изпише:
        //o "You can't save the money."
        //o "{Общ брой изминали дни}"
        //· Ако Джеси събере парите за почивката на конзолата се изписва:
        //o "You saved the money for {общ брой изминали дни} days."

        double tripprice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int countdays = 0 ;
        int fivedays = 0;
        double correctmoney = 0;

        while (true) {

            String doing = scanner.nextLine();
            double moneyinout = Double.parseDouble(scanner.nextLine());
            countdays +=1;


            if (doing.equals("save")) {
                money = money + moneyinout;

                fivedays = 0;
            } else if (doing.equals("spend")) {

                fivedays += 1;
               money = money - moneyinout;
            }

            if (money <= 0){
                money = 0;
            }

            if (fivedays == 5) {
                System.out.printf("You can't save the money.%n");
                System.out.printf("%d",countdays);
                break;
            }

            if (money >= tripprice) {
                System.out.printf("You saved the money for %d days.", countdays);
                break;
            }

        }

    }
}
