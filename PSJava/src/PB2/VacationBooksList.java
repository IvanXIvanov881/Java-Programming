import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Брой страници в текущата книга – цяло число в интервала [1…1000]
        int bookpages = Integer.parseInt(scanner.nextLine());

        //2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
        int pagesbyhour = Integer.parseInt(scanner.nextLine());

        //3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала
        int days = Integer.parseInt(scanner.nextLine());


        int neededhours = bookpages / pagesbyhour;
        //Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.
        int total = neededhours / days;

        System.out.println(total);

    }
}
