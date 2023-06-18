import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resurses = new LinkedHashMap<>();

        while (true) {

            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            int valueMap = Integer.parseInt(scanner.nextLine());

            if (resurses.containsKey(command)){
                resurses.put(command,resurses.get(command)+valueMap);
            }
            resurses.putIfAbsent(command,valueMap);

        }

        for (Map.Entry<String, Integer> ent : resurses.entrySet()) {
            System.out.printf("%s -> %d%n",ent.getKey(),ent.getValue());
        }
    }
}
