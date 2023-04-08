import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //За даден период от време, всеки ден в болницата пристигат пациенти за преглед. Тя разполага първоначално със 7 лекари.
        // Всеки лекар може да преглежда само по един пациент на ден, но понякога има недостиг на лекари,
        // затова останалите пациенти се изпращат в други болници. Всеки трети ден, болницата прави изчисления и
        // ако броят на непрегледаните пациенти е по-голям от броя на прегледаните, се назначава още един лекар.
        // Като назначаването става преди да започне приемът на пациенти за деня.
        //Напишете програма, която изчислява за дадения период броя на прегледаните и непрегледаните пациенти.


        int time = Integer.parseInt(scanner.nextLine());


        int doctors = 7;
        int treatedpatients = 0;
        int untreatedpatients = 0;

        int countdays = 1;


        for (int i = 1; i <= time; i++) {
            countdays++;
            int patients = Integer.parseInt(scanner.nextLine());

            if (doctors - patients >= 0) {
                treatedpatients = treatedpatients + patients;
            } else {
                treatedpatients = treatedpatients + doctors;
                untreatedpatients = untreatedpatients + (patients - doctors);
            }

            if (countdays % 3 == 0 && untreatedpatients > treatedpatients) {
                doctors++;
            }

        }

        System.out.printf("Treated patients: %d.\n", treatedpatients);
        System.out.printf("Untreated patients: %d.\n", untreatedpatients);


    }
}
