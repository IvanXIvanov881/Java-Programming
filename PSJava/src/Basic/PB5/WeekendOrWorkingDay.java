import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Почивен или работен ден
//Напишете програма която, чете ден от седмицата (текст), на английски език - въведен от потребителя.
// Ако денят е работен отпечатва на конзолата - "Working day", ако е почивен - "Weekend".
// Ако се въведе текст различен от ден от седмицата да се отпечата - "Error".

        String day = scanner.nextLine();

        switch (day) {
            case ("Monday"):
            case ("Tuesday"):
            case ("Wednesday"):
            case ("Thursday"):
            case ("Friday"):
                System.out.println("Working day");
                break;
            case ("Saturday"):
                System.out.println("Weekend");
                break;
            case ("Sunday"):
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");


        }

    }
}
