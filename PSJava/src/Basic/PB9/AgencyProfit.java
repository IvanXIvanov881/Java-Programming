import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Напишете програма, която изчислява печалбата на агенция за продажба на самолетни билети.

        //. Агенцията продава самолетни билети на различни авиокомпании. Ще получите информация за броя продадени
        // билети за възрастни и броя продадени детски билети. Нетната цена на билета за възрастен се определя от авиокомпанията, а детският билет е със 70% по-евтин.
        //Агенцията добавя към нетната цена на всеки билет такса обслужване.  Крайната печалба на Агенцията е 20% от общата цена на всички билети.


        //Вход:
        //От конзолата се четат 5 реда:
        //Име на авиокомпанията - текст
        //Брой билети за	 възрастни – цяло число в диапазона [1…400]
        //Брой детски билети – цяло число в диапазона [25…120]
        //Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
        //Цената на такса обслужване - реално число в диапазона [10.0…50.0]

        //Изход:
        //Да се отпечата на конзолата крайната печалбата от продажбите, в следния формат:
        //"The profit of your agency from {име на авиокомпанията} tickets is {печалба за агенцията} lv."
        //Цената на печалбата да бъде форматирана до втората цифра след десетичния знак.

        String company = scanner.nextLine();
        int ticketsadult = Integer.parseInt(scanner.nextLine());
        int ticketskids = Integer.parseInt(scanner.nextLine());
        double priceadult = Double.parseDouble(scanner.nextLine());
        double expraprice = Double.parseDouble(scanner.nextLine());


        double pricekidstotal = (priceadult * 0.30) + expraprice;
        double adultpricetotal = priceadult + expraprice;

        double total = (pricekidstotal * ticketskids) + (adultpricetotal * ticketsadult);
        double totalwin = total * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, totalwin);







    }
}
