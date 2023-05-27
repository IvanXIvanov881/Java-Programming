import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети: студентски(student),
        // стандартен(standard) и детски(kid), за всички прожекции. Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.

        //Вход
        //Входът е поредица от цели числа и текст:
        //· На първия ред до получаване на командата "Finish" - име на филма – текст
        //· На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
        //· За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
        //o Типа на закупения билет - текст ("student", "standard", "kid"

        //Изход
        //На конзолата трябва да се печатат следните редове:
        //· След всеки филм да се отпечата, колко процента от кино залата е пълна
        //"{името на филма} - {процент запълненост на залата}% full."
        //· При получаване на командата "Finish" да се отпечатат четири реда:
        //o "Total tickets: {общият брой закупени билети за всички филми}"
        //o "{процент на студентските билети}% student tickets."
        //o "{процент на стандартните билети}% standard tickets."
        //o "{процент на детските билети}% kids tickets."


        String input = scanner.nextLine(); // команда ИЛИ филм

        int allCountTickets = 0; // брой на ВСИЧКИ билети
        int studentCount = 0;
        int standardCount = 0;
        int kidsCount = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int freeSeat = Integer.parseInt(scanner.nextLine()); // за свободните места в салона

            int countTickets = 0; // брой билети за КОНКРЕТЕН филм

            String command = scanner.nextLine(); // ИЛИ тип билет, ИЛИ команда
            while (!command.equals("End")) {
                String typeTicket = command;

                allCountTickets++; // всички билети + 1
                countTickets++; // билети за конкретен филм + 1

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidsCount++;
                        break;
                }
                if (freeSeat == countTickets) { // ако свободните места са равни на билети за конректния филм, то прекъсни вътрешния while
                    break;
                }
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, countTickets * 100.0 / freeSeat);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allCountTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardCount * 100.0 / allCountTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsCount * 100.0 / allCountTickets);
    }
}