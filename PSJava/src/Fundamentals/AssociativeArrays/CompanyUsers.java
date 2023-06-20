import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> employeeMap = new LinkedHashMap<>();

        while (!command.equals("End")){

            String[] commandArr = command.split(" -> ");

            if (!employeeMap.containsKey(commandArr[0])){
                employeeMap.put(commandArr[0],new ArrayList<>());
                employeeMap.get(commandArr[0]).add(0,commandArr[1]);
            } else {
                boolean isSame = false;

                for (int i = 0; i<employeeMap.get(commandArr[0]).size(); i++){
                    if (commandArr[1].equals(employeeMap.get(commandArr[0]).get(i))){
                        isSame = true;
                        break;
                    }
                }

                if (!isSame){
                    employeeMap.get(commandArr[0]).add(commandArr[1]);
                }

            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> ent : employeeMap.entrySet()) {
            System.out.printf("%s%n", ent.getKey());
            for (int i = 0; i<ent.getValue().size();i++){
                System.out.printf("-- %s%n",ent.getValue().get(i));
            }
        }

    }
}
