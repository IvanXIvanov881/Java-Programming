import java.util.Scanner;

public class ToyShop {


        public static void main(String args[]) {

// Петя иска да отиде на екскурзия, дали ще й стигнат парите.


// цени на играчките:
//puzzle - 2.60lv
//talking doll - 3lv
//bear - 4.10lv
//minion 8.20lv
//truck - 2lv

//при поръчани повече от 50 играчки прави отстъпка 25%

//има разход от 10% за наем

//вход цена екскурзия и играчки 6 реда

// изход ще й стигнат парите за екскурзия

            Scanner scanner = new Scanner(System.in);

            double trip = Double.parseDouble(scanner.nextLine());
            int puzzle = Integer.parseInt(scanner.nextLine());
            int dolls = Integer.parseInt(scanner.nextLine());
            int bear = Integer.parseInt(scanner.nextLine());
            int minion = Integer.parseInt(scanner.nextLine());
            int truck = Integer.parseInt(scanner.nextLine());

            double puzzleprice = puzzle * 2.60;
            double dollsprice = dolls * 3;
            double bearprice = bear * 4.10;
            double minionprice = minion * 8.20;
            double truckprice = truck * 2;


            double totalnum = puzzle + dolls + bear + minion + truck;
            double totalprice = puzzleprice + dollsprice + bearprice + minionprice + truckprice;

            double total = totalprice - (totalprice * 10 / 100);

            if (totalnum >= 50) {
                total = total - (total * 25 / 100);
            }




            if (total < trip) {
                double need = trip - total;
                System.out.printf("Not enough money! %.2f lv needed.", need);
            } else {
                double need = total - trip;
                System.out.printf("Yes! %.2f lv left.", need);
            }

        }
}
