import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Програма, която изчислява необходимате сума.


        //1. Кв. метри, които ще бъдат озеленени – реално число в интервала
        Double Meters = Double.parseDouble(scanner.nextLine());

        //Цената на един кв. м. е 7.61 лв със ДДС.
        //Фирмата изпълнител предлага 18% отстъпка от крайната цена.
        Double Sum = Meters * 7.61;
        Double Discount = 7.61 * 0.18;
        Double SumDiscount = Meters * Discount;


        //2.На конзолата се отпечатват два реда:
        //"The final price is: {крайна цена на услугата} lv."
        //"The discount is: {отстъпка} lv."
        System.out.println("The final price is: " + (Sum - SumDiscount));
        System.out.println("The discount is: " + SumDiscount);

    }
}
