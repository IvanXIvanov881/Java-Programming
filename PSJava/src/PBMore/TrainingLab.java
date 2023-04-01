import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    //Учебна зала има правоъгълен размер w на h метра
        //Вход
        //От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
    //разделена на две части – лява и дясна, с коридор приблизително по средата - Коридорът е широк поне 100 cm

    //В лявата и в дясната част има редици с бюра
    //Едно работно място заема 70 на 120 cm
    //заради входната врата се губи точно 1 работно място
    //заради катедрата се губят точно 2 работни места

    //Ограничения: 3 ≤ h ≤ w ≤ 100.

    //Изход
    //Да се отпечата на конзолата едно цяло число: броят места в учебната зала.

        double Long = w * 100;
        double width = (h * 100) - 100;
        int rows = (int) width / 70;
        int colons = (int) Long / 120;
        int total = (rows * colons) - 3;

        System.out.println(total);



    }
}
