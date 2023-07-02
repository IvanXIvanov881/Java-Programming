import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] commandArr = scanner.nextLine().split(" ");

            switch (commandArr[0]) {
                case "register":
                    if (!parkingMap.containsKey(commandArr[1])) {
                        parkingMap.put(commandArr[1], commandArr[2]);
                        System.out.printf("%s registered %s successfully%n",commandArr[1],commandArr[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", commandArr[2]);
                    }
                    break;
                case "unregister":
                    if (parkingMap.containsKey(commandArr[1])) {
                        parkingMap.remove(commandArr[1]);
                        System.out.printf("%s unregistered successfully%n",commandArr[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", commandArr[1]);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> ent : parkingMap.entrySet()) {
            System.out.printf("%s => %s%n",ent.getKey(),ent.getValue());
        }

    }
}
