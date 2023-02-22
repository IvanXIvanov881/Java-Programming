import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {

        //Прочетете входните данни от конзолата (щатските долари)
        Scanner scanner = new Scanner(System.in);

        //конвертиране на щатски долари (USD) в български лева (BGN)
        //Използвайте фиксиран курс между долар и лев: 1 USD = 1.79549 BGN
        double USD = Double.parseDouble(scanner.next());
        double BGN = USD * 1.79549;

        //Принтирайте получените български лева
        System.out.println(BGN);

    }
}
