import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rolls = Integer.parseInt(scanner.nextLine());

        String biggestModel = "";
        double bestModel = 0;

        for (int i = 0; i < rolls; i++) {

            String model = scanner.nextLine();
            Double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double modelSize = Math.PI * (radius * radius) * height;

            if (bestModel <= modelSize) {
                bestModel = modelSize;
                biggestModel = model;
            }

        }

        System.out.println(biggestModel);
    }
}
