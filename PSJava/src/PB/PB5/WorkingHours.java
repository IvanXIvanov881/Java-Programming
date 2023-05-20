import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {

        //Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) -
        // въведени от потребителя и проверява дали офисът на фирма е отворен, като работното време на офисът е от 10-18 часа,
        // от понеделник до събота включително

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour < 18) {
            switch (day) {
                case "Monday":
                    System.out.println("open");
                    break;
                case "Tuesday":
                    System.out.println("open");
                    break;
                case "Wednesday":
                    System.out.println("open");
                    break;
                case "Thursday":
                    System.out.println("open");
                    break;
                case "Friday":
                    System.out.println("open");
                    break;
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }


    }
}

