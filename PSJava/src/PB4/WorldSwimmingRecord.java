import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        //Вход
        //От конзолата се четат 3 реда:
        //1. Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2. Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3. Времето в секунди, за което плува разстояние от 1 м. - реално число в интервала [0.00 … 1000.00]

        double seconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secmeters = Double.parseDouble(scanner.nextLine());

        //На конзолата се въвежда рекордът в секунди, който Иван трябва да подобри,
        // разстоянието в метри, което трябва да преплува и времето в секунди, за което плува разстояние от 1 м.

        //Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид, че:
        // съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.

        //Когато се изчислява колко пъти Иван ще се забави, в резултат на съпротивлението на водата,
        // резултатът трябва да се закръгли надолу до най-близкото цяло число.

        //Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния рекорд.


double ivantempo = meters * secmeters;
double slow = Math.floor(meters /15);
double slowtotal = slow * 12.5;
double totaltime = ivantempo + slowtotal;


if (seconds > totaltime) {
    System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totaltime);
} else {
    double fail = totaltime - seconds;
    System.out.printf("No, he failed! He was %.2f seconds slower.", fail); }


        //Изход
        //Отпечатването на конзолата зависи от резултата:
        //· Ако Иван е подобрил Световния рекорд (времето му е по-малко от рекорда) отпечатваме:
        //o "Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //· Ако НЕ е подобрил рекорда (времето му е по-голямо или равно на рекорда) отпечатваме:
        //o "No, he failed! He was {недостигащите секунди} seconds slower."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.


    }
}
