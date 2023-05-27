import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Поканени сте от академията да напишете софтуер, който да пресмята точките за актьор/актриса.
        // Академията ще ви даде първоначални точки за актьора.


        //Вход
        //• Име на актьора - текст
        //• Точки от академията - реално число в интервала [2.0... 450.5]
        //• Брой оценяващи n - цяло число в интервала[1… 20]
        //На следващите n-на брой реда:
        //o Име на оценяващия - текст
        //o Точки от оценяващия - реално число в интервала [1.0... 50.0]

        String actor = scanner.nextLine();
        double startpoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());


        double total = 0;


        for (int i = 1; i <= jury; i++) {

            String juryname = scanner.nextLine();
            double jurypoints = Double.parseDouble(scanner.nextLine());
            double total1 = ((juryname.length() * jurypoints) / 2);
            total =  total + total1;
            if (total + startpoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, (total + startpoints));
                break;
            }

        }



        if (total + startpoints < 1250.5) {
            double needpoints = 1250.5 - (total + startpoints);
            System.out.printf("Sorry, %s you need %.1f more!", actor, needpoints);
        }

    }
}


// Академията ще ви даде първоначални точки за актьора.
//Точките, които актьора получава се формират от: дължината на името на оценяващия умножено по точките, които дава делено на две.
//Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата, че дадения актьор е получил номинация.


//Изход
//Да се отпечата на конзолата един ред:
//· Ако точките са над 1250.5:
//"Congratulations, {име на актьора} got a nominee for leading role with {точки}!"
//· Ако точките не са достатъчни:
//"Sorry, {име на актьора} you need {нужни точки} more!"
//Резултатът да се форматирана до първата цифра след десетичния знак!