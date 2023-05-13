import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която да пресмята статистика за оценки от изпит. В началото програмата получава броя на студентите явили се
        // на изпита и за всеки студент неговата оценка. На края програмата
        // трябва да отпечата процента студенти с оценка между 2.00 и 2.99, между 3.00 и 3.99, между 4.00 и 4.99, 5.00 или повече.
        // Също така и средния успех на изпита.

        //Вход:
        //От конзолата се четат:
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        //За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        //Изход:
        //Да се отпечатат на конзолата 5 реда, които съдържат следната информация:
        //"Top students: {процент студенти с успех 5.00 или повече}%"
        //"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
        //"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
        //"Fail: {по-малко от 3.00}%"
        //"Average: {среден успех}"
        //Всички числа трябва да са форматирани до втория знак след десетичната запетая.

        int students = Integer.parseInt(scanner.nextLine());

        double totalgood = 0;
        double totalchetiri = 0;
        double totaltri = 0;
        double totalfail = 0;
        double average = 0;
        double allpoints = 0;

        for (int i = 1; i <= students; i++) {

            double points = Double.parseDouble(scanner.nextLine());

            if (points >= 5) {
                totalgood++;
                allpoints = allpoints + points;
            }

            if (points >= 4 && points <= 4.99) {
                totalchetiri++;
                allpoints = allpoints + points;
            }

            if (points >= 3 && points <= 3.99) {
                totaltri++;
                allpoints = allpoints + points;
            }

            if (points < 3) {
                totalfail++;
                allpoints = allpoints + points;
            }

        }


        double typeedno = totalgood / students * 100;
        double typedve = totalchetiri / students * 100;
        double typetri = totaltri / students * 100;
        double typechetiri = totalfail / students * 100;
        double sredna = allpoints / students;


        System.out.printf("Top students: %.2f%%%n",typeedno);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",typedve);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",typetri);
        System.out.printf("Fail: %.2f%%%n",typechetiri);
        System.out.printf("Average: %.2f%n",sredna);

    }
}
