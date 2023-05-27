import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {

        //Да се напише конзолна програма, която прочита възраст (десетично число) и пол ("m" или "f"),
        // въведени от потребителя и отпечатва обръщение измежду следните:
        //· "Mr." - мъж (пол "m") на 16 или повече години
        //· "Master" - момче (пол "m") под 16 години
        //· "Ms." - жена (пол "f") на 16 или повече години
        //· "Miss" - момиче (пол "f") под 16 години

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16) {

            if (gender.equals("m")) {
                System.out.println("Mr.");
            }
            if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }

        if (age < 16) {

            if (gender.equals("m")) {
                System.out.println("Master");
            }
            if (gender.equals("f")) {
                System.out.println("Miss");
            }
        }
    }

}

