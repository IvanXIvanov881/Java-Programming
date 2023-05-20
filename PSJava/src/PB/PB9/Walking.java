import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
        // Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
        //Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път като излиза през деня и
        // когато постигне целта си да се изписва "Goal reached! Good job!"
        //и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".

        //Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките, които е извървяла докато се прибира.
        // След което, ако не е успяла да постигне целта си, на конзолата трябва да се изпише: "{разликата между стъпките} more steps to reach goal."


        int totalsteps = 10000;
        int stepscount = 0;

        while (true) {
            String steps = scanner.nextLine();

            if (steps.equals("Going home")) {
                int stepstohome = Integer.parseInt(scanner.nextLine());
                stepscount = stepscount + stepstohome;
                if (stepscount >= totalsteps) {
                    int total = stepscount - totalsteps;
                    System.out.printf("Goal reached! Good job!%n");
                    System.out.printf("%d steps over the goal!", total);
                    break;
                } else {
                    int lost = totalsteps - stepscount;
                    System.out.printf("%d more steps to reach goal.", lost);
                    break;
                }
            }

            int stepsin = Integer.parseInt(steps);

            stepscount = stepscount + stepsin;

            if (stepscount >= totalsteps) {
                int total = stepscount - totalsteps;
                System.out.printf("Goal reached! Good job!%n");
                System.out.printf("%d steps over the goal!", total);
                break;
            }
        }

    }
}
