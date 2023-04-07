import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Провокирани от сватбата си, Михаела и Иван решават да предоставят нова услуга на клиенти на ресторанта си, а именно вечеря за запознанства -
        // "Предизвикай Сватбата".
        // Напишете програма, която отпечатва всички възможни срещи на клиентите на ресторанта.
        // При настаняване всеки мъж и всяка жена получават талончета с поредни номера стартирайки от 1.
        // Ако бъдат заети всички маси, програмата трябва да приключи. Всяка маса има две места.

        //От конзолата се четат точно 3 числа, всяко на отделен ред:
        //Броя клиенти мъже - цяло число в интервала [1...100]
        //Броя клиенти жени - цяло число в интервала [1...100]
        //Максималният брой маси - цяло число в интервала [1...100]

        //Изход
        //На конзолата се принтират на един ред, разделени с интервал всички срещи в следният формат:
        //({№ клиент} <-> {№ клиент}) ({№ клиент} <-> {№ клиент}) ...


        int mans = Integer.parseInt(scanner.nextLine());
        int womans = Integer.parseInt(scanner.nextLine());
        int places = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 1; i <= mans; i++) {
            for (int j = 1; j <= womans; j++) {

                if (counter == places) {
                    return;
                }

                System.out.printf("(%d <-> %d) ", i, j);

                counter++;


            }
        }

    }
}
