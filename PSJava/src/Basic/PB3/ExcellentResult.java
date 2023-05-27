import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {

        //Напише конзолна програма, която чете оценка (цяло число), въведена от потребителя и отпечатва "Excellent!"
        // ако оценката е 5 или по-висока.
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        }



    }
}
