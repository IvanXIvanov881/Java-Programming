import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Ани отива до родния си град след много дълъг период извън страната. Прибирайки се вкъщи, тя вижда старата библиотека
// на баба си и си спомня за любимата си книга. Помогнете на Ани, като напишете програма, в която тя въвежда търсената от нея книга (текст)


        //. Докато Ани не намери любимата си книга или не провери всички книги в библиотеката,
        // програмата трябва да чете всеки път на нов ред името на всяка следваща книга (текст), която тя проверява.
        //Книгите в библиотеката са свършили щом получите текст "No More Books".

        String bookneed = scanner.nextLine();
        int checkbooks = 0;

        while (true) {


            String bookcheck = scanner.nextLine();


            if(bookneed.equals(bookcheck)) {
                System.out.printf("You checked %d books and found it.", checkbooks);
                break;
            }

            if (bookcheck.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n You checked %d books.", checkbooks);
                break;
            }

            checkbooks = checkbooks +1;

        }
    }
}
