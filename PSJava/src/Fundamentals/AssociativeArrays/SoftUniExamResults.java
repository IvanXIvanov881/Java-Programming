import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String,String> userProgramMap = new LinkedHashMap<>();
        Map<String,Integer> programCountMap = new LinkedHashMap<>();
        while (!command.equals("exam finished")){

            String[] commandArr = command.split("-");

            if (commandArr[1].equals("banned")){
                    userProgramMap.remove(commandArr[0]);
            } else {
                if (!userProgramMap.containsKey(commandArr[0]) && !programCountMap.containsKey(commandArr[1])) {
                    userProgramMap.putIfAbsent(commandArr[0], commandArr[2]);
                    programCountMap.putIfAbsent(commandArr[1], 1);
                } else if (!userProgramMap.containsKey(commandArr[0]) && programCountMap.containsKey(commandArr[1])){
                    userProgramMap.put(commandArr[0],commandArr[2]);
                    programCountMap.put(commandArr[1],programCountMap.get(commandArr[1])+1);
                } else if (userProgramMap.containsValue(commandArr[0]) && !programCountMap.containsKey(commandArr[1])){
                    userProgramMap.put(commandArr[0],commandArr[2]);
                    programCountMap.put(commandArr[1],1);
                } else if (userProgramMap.containsKey(commandArr[0]) && programCountMap.containsKey(commandArr[1])){
                    if (Integer.parseInt(userProgramMap.get(commandArr[0])) < Integer.parseInt(commandArr[2])){
                        userProgramMap.put(commandArr[0],commandArr[2]);
                    }
                    programCountMap.put(commandArr[1], programCountMap.get(commandArr[1])+1);
                }
            }

            command = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, String> entUser : userProgramMap.entrySet()) {
            System.out.printf("%s | %s%n",entUser.getKey(),entUser.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entProg : programCountMap.entrySet()) {
            System.out.printf("%s - %d%n",entProg.getKey(),entProg.getValue());
        }

    }
}
