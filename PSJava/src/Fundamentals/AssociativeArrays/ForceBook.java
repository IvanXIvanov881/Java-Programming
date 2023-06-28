import java.util.*;

public class ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> forceMap = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {


            if (command.contains("|")) {

                String[] commandArr = command.split(" \\| ");

                boolean isThereForce = false;
                boolean isThereUser = false;
                String locationOfUser = "";

                if (!forceMap.containsKey(commandArr[0])) {
                    forceMap.put(commandArr[0],new ArrayList<>());
                }

                for (List<String> list : forceMap.values()) {
                    if (list.contains(commandArr[1])) {
                        isThereUser = true;
                    }
                }

                if (forceMap.containsKey(commandArr[0])) {
                    isThereForce = true;
                }

                if (!isThereUser && isThereForce) {
                    forceMap.get(commandArr[0]).add(commandArr[1]);
                }


            } else if (command.contains("->")) {

                String[] commandArr = command.split(" -> ");

                boolean isThereForce2 = false;
                boolean isThereUser2 = false;
                String locationOfUser2 = "";

                forceMap.entrySet().forEach(entry -> entry.getValue().remove(commandArr[0]));

                for (Map.Entry<String, List<String>> ent : forceMap.entrySet()) {
                    for (int j = 0; j < ent.getValue().size(); j++) {
                        if (ent.getValue().get(j).equals(commandArr[0])) {
                            isThereUser2 = true;
                            locationOfUser2 = ent.getKey();
                            break;
                        }
                    }
                }

                if (forceMap.containsKey(commandArr[1])) {
                    isThereForce2 = true;
                }
                if (isThereForce2 && isThereUser2) {

                    forceMap.get(commandArr[1]).add(commandArr[0]);
                    System.out.printf("%s joins the %s side!\n", commandArr[0], commandArr[1]);

                } else if (!isThereForce2 && isThereUser2) {
                    forceMap.put(commandArr[1], new ArrayList<>());
                    forceMap.get(commandArr[1]).add(0, commandArr[0]);

                    forceMap.get(commandArr[1]).add(commandArr[0]);
                    System.out.printf("%s joins the %s side!\n", commandArr[0], commandArr[1]);

                } else if (!isThereUser2 && isThereForce2) {
                    forceMap.get(commandArr[1]).add(commandArr[0]);
                    System.out.printf("%s joins the %s side!\n", commandArr[0], commandArr[1]);

                } else if (!isThereUser2 && !isThereForce2) {
                    forceMap.put(commandArr[1], new ArrayList<>());
                    forceMap.get(commandArr[1]).add(commandArr[0]);
                }

            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> printEnt : forceMap.entrySet()) {

            if (!printEnt.getValue().isEmpty()) {
                int members = printEnt.getValue().size();
                System.out.printf("Side: %s, Members: %d\n", printEnt.getKey(), members);
                for (int i = 0; i < printEnt.getValue().size(); i++) {
                    System.out.printf("! %s\n", printEnt.getValue().get(i));
                }
            }
        }

    }
}
