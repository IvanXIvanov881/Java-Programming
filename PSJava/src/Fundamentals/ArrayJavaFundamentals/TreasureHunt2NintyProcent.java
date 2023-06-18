import java.util.Scanner;

public class TreasureHunt2NintyProcent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();

        String[] treasureChest = firstInput.split("\\|");

        while (true) {

            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("Yohoho!")) {
                break;
            }

            if (command[0].equals("Loot")) {
                String newItem = "";
                for (int i = 1; i < command.length; i++) {
                    boolean isNew = false;
                    for (int j = 1; j < treasureChest.length; j++) {
                        if (command[i].equals(treasureChest[j])) {
                            isNew = false;
                            break;
                        } else {
                            isNew = true;
                            newItem = command[i];
                        }
                    }
                    if (isNew) {
                        String[] tempTreasure = new String[treasureChest.length + 1];
                        for (int k = 0; k < treasureChest.length; k++) {
                            tempTreasure[k + 1] = treasureChest[k];
                        }
                        tempTreasure[0] = newItem;
                        treasureChest = new String[tempTreasure.length];
                        for (int j = 0; j < treasureChest.length; j++) {
                            treasureChest[j] = tempTreasure[j];
                        }
                        isNew = false;
                    }
                }
            }

            if (command[0].equals("Drop")) {

                int commandNum = Integer.parseInt(command[1]);
                if (commandNum < 0 && commandNum >= treasureChest.length - 1) {
                    break;
                }

                if (commandNum > 0 && commandNum <= treasureChest.length - 1) {

                    String item = treasureChest[commandNum];

                    for (int i = commandNum; i < treasureChest.length - 1; i++) {
                        treasureChest[i] = treasureChest[i + 1];
                    }
                    treasureChest[treasureChest.length - 1] = item;
                }

            }

            if (command[0].equals("Steal")) {
                int commandNum = Integer.parseInt(command[1]);

                if (commandNum <= 0 || commandNum >= treasureChest.length) {

                    System.out.println(String.join(", ", treasureChest));
                    System.out.println("Failed treasure hunt.");
                    return;
                }

                if (commandNum > 0 && commandNum <= treasureChest.length - 1) {
                    String[] tempTreasure = new String[treasureChest.length - commandNum];

                    String[] stolenItems = new String[commandNum];

                    int counter = 0;
                    for (int i = treasureChest.length - commandNum; i < treasureChest.length; i++) {
                        stolenItems[counter] = treasureChest[i];
                        counter++;
                    }

                    System.out.println(String.join(", ", stolenItems));

                    for (int i = 0; i < treasureChest.length - commandNum; i++) {
                        tempTreasure[i] = treasureChest[i];
                    }

                    treasureChest = new String[treasureChest.length - commandNum];
                    for (int i = 0; i < treasureChest.length; i++) {
                        treasureChest[i] = tempTreasure[i];
                    }
                }
            }
        }

        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / treasureChest.length;
        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
