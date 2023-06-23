import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> studentsMap = new LinkedHashMap<>();

        while (!command.equals("end")) {

            String[] commandArr = command.split(" : ");

            if (!studentsMap.containsKey(commandArr[0])) {
                studentsMap.put(commandArr[0], new ArrayList<>());
                studentsMap.get(commandArr[0]).add(0, "1");
                studentsMap.get(commandArr[0]).add(1, commandArr[1]);
            } else {
                int count = Integer.parseInt(studentsMap.get(commandArr[0]).get(0)) + 1;
                String countStr = "" + count;
                studentsMap.get(commandArr[0]).remove(0);
                studentsMap.get(commandArr[0]).add(0, countStr);
                studentsMap.get(commandArr[0]).add(commandArr[1]);
            }


            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> ent : studentsMap.entrySet()) {
            System.out.printf("%s: %s%n", ent.getKey(), ent.getValue().get(0));

            for (int i = 1; i < ent.getValue().size(); i++) {
                System.out.printf("-- %s%n", ent.getValue().get(i));
            }
        }
    }
}
