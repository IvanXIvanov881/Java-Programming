import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<String>> dragonsMap = new TreeMap<>();
        List<String> colorsList = new ArrayList<>();
        //Red Bazgargal 100 2500 25
        for (int i = 0; i < n; i++) {

            String[] commandArr = scanner.nextLine().split(" ");

            if (!colorsList.contains(commandArr[0])) {
                colorsList.add(commandArr[0]);
            }
            String colorName = commandArr[0] + " " + commandArr[1];
            String damage = commandArr[2];
            String health = commandArr[3];
            String armor = commandArr[4];

            if (!dragonsMap.containsKey(colorName)) {
                dragonsMap.put(colorName, new ArrayList<>());
                if (damage.equals("null")) {
                    dragonsMap.get(colorName).add(0, "45");
                } else {
                    dragonsMap.get(colorName).add(0, damage);
                }
                if (health.equals("null")) {
                    dragonsMap.get(colorName).add(1, "250");
                } else {
                    dragonsMap.get(colorName).add(1, health);
                }
                if (armor.equals("null")) {
                    dragonsMap.get(colorName).add(2, "10");
                } else {
                    dragonsMap.get(colorName).add(2, armor);
                }
            } else {
                if (damage.equals("null")) {
                    dragonsMap.get(colorName).add(0, "45");
                } else {
                    dragonsMap.get(colorName).add(0, damage);
                }
                if (health.equals("null")) {
                    dragonsMap.get(colorName).add(1, "250");
                } else {
                    dragonsMap.get(colorName).add(1, health);
                }
                if (armor.equals("null")) {
                    dragonsMap.get(colorName).add(2, "10");
                } else {
                    dragonsMap.get(colorName).add(2, armor);
                }
            }

        }

        for (int i = 0; i < colorsList.size(); i++) {

            double damageAvr = 0;
            int countDmg = 0;
            double healthAvr = 0;
            int countHlt = 0;
            double armorAvr = 0;
            int countArm = 0;

            for (Map.Entry<String, List<String>> dmg : dragonsMap.entrySet()) {
                if (colorsList.get(i).equals(dmg.getKey().split(" ")[0])) {
                    damageAvr = damageAvr + Double.parseDouble(dmg.getValue().get(0));
                    countDmg++;
                    healthAvr = healthAvr + Double.parseDouble(dmg.getValue().get(1));
                    countHlt++;
                    armorAvr = armorAvr + Double.parseDouble(dmg.getValue().get(2));
                    countArm++;
                }
            }

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", colorsList.get(i), (damageAvr / countDmg), (healthAvr / countHlt), (armorAvr / countArm));

            for (Map.Entry<String, List<String>> entPrint : dragonsMap.entrySet()) {
                if (colorsList.get(i).equals(entPrint.getKey().split(" ")[0])) {
                    System.out.printf("-%s -> damage: %s, health: %s, armor: %s%n", entPrint.getKey().split(" ")[1], entPrint.getValue().get(0)
                            , entPrint.getValue().get(1), entPrint.getValue().get(2));
                }
            }
        }
    }
}
