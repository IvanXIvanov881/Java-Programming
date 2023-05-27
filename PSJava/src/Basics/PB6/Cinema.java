import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        //В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони. Има три вида прожекции с билети на различни цени:
        //· Premiere – премиерна прожекция, на цена 12.00 лева.
        //· Normal – стандартна прожекция, на цена 7.50 лева.
        //· Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        //Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа), въведени от потребителя,
        // и изчислява общите приходи от билети при пълна зала.
        // Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double people = r * c;
        double price = 0;



        if (projection.equals("Premiere")) {
            price = people * 12;

        } else if (projection.equals("Normal")) {
           price = people * 7.50;
          ;
        } else if (projection.equals("Discount")){
            price = people * 5;
        }

        System.out.printf("%.2f",price);
        System.out.println();
        System.out.printf("leva");



    }
}
