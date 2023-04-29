import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Младоженците искат да направят списък кой на кое място ще седи на сватбената церемония. Местата са разделени на различни сектори.
        // Секторите са главните латински букви като започват от A. Във всеки сектор има определен брой редове.
        // От конзолата се чете броят на редовете в първия сектор (A), като във всеки следващ сектор редовете се увеличават с 1.
        // На всеки ред има определен брой места -
        // тяхната номерация е представена с малките латински букви. Броя на местата на нечетните редове се прочита от конзолата,
        // а на четните редове местата са с 2 повече.

        //Вход
        //От конзолата се четaт 3 реда:
        //Последния сектор от секторите - символ (B-Z)
        //Броят на редовете в първия сектор - цяло число (1-100)
        //Броят на местата на нечетен ред - цяло число (1-24)
        //Изход
        //Да се отпечата на конзолата всяко място на отделен ред по следния формат:
        //{сектор}{ред}{място}
        //Накрая трябва да отпечата броя на всички мест


        String sector = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int odds = Integer.parseInt(scanner.nextLine());

        Character sector1 = sector.charAt(0);

        int counter = 0;

        int correctrows = rows;
        int correctodds = odds;
        int correctletter = 100;

        for (int i = 1; i <= 30; i++) {

            if (i > 1) {
                correctrows = correctrows + 1;
            }

            for (int j = 1; j <= correctrows; j++) {
                for (int k = 1; k <= correctodds; k++) {


                    Character letter = (char) (i + 64);
                    Character letter2 = (char) (k + 96);


                    if (i > correctletter) {
                        System.out.printf("%d", counter);
                        return;
                    }

                    if (j % 2 == 0) {
                        correctodds = odds + 2;
                    }

                    if (j % 2 != 0) {
                        correctodds = odds;
                    }

                    counter = counter + 1;
                    System.out.printf("%s%d%s\n", letter, j, letter2);


                    if (sector1.equals(letter)) {
                        correctletter = i;
                    }


                }
            }
        }


    }
}
