import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {

        //Да се напише програма, която чете име на продукт, въведено от потребителя и проверява дали е плод или зеленчук.
        //· Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
        //· Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
        //· Всички останали са "unknown"
        //Да се изведе "fruit", "vegetable" или "unknown" според въведения продукт.

        Scanner scanner = new Scanner(System.in);

        String object = scanner.nextLine();

        switch (object) {
            case "banana":
                System.out.println("fruit");
                break;
            case "apple":
                System.out.println("fruit");
                break;
            case "kiwi":
                System.out.println("fruit");
                break;
            case "cherry":
                System.out.println("fruit");
                break;
            case "lemon":
                System.out.println("fruit");
                break;
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
                System.out.println("vegetable");
                break;
            case "cucumber":
                System.out.println("vegetable");
                break;
            case "pepper":
                System.out.println("vegetable");
                break;
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");



        }
    }
}
