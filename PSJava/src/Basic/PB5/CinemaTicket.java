import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        //Да се напише програма която чете ден от седмицата (текст) –
        // въведен от потребителя и принтира на конзолата цената на билет за кино според деня от седмицата:

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")) {
            System.out.printf("12");
        }

        if (day.equals("Wednesday") || day.equals("Thursday")) {
            System.out.printf("14");
        }

        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.printf("16");
        }



    }
}
