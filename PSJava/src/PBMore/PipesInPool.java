import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {

        //има 2 тръби от които се пълни
        //Всяка тръба има определен дебит (литрите вода минаващи през една тръба за един час).
        //Работникът пуска тръбите едновременно и излиза за N часа.
        //програма, която изкарва състоянието на басейна, в момента, когато работникът се върне.

        //Вход
        //От конзолата се четат четири реда:
        //Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]

        //Изход
        //Да се отпечата на конзолата едно от двете възможни състояния:
        //До колко се е запълнил басейна и коя тръба с колко процента е допринесла.
        //"The pool is {запълненост на басейна в проценти}% full. Pipe 1: {процент вода от първата тръба}%. Pipe 2: {процент вода от втората тръба}%."
        //Aко басейнът се е препълнил – с колко литра е прелял за даденото време.
        //"For {часовете, които тръбите са пълнили вода} hours the pool overflows with {литрите вода в повече} liters."

        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1liters = pipe1 * hours;
        double pipe2liters = pipe2 * hours;
        double water = pipe1liters + pipe2liters;

        if (water <= volume) {

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    water / volume * 100, pipe1liters / water * 100, pipe2liters / water * 100);
        } else {

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",
                    hours,water - volume );
        }


    }
}
