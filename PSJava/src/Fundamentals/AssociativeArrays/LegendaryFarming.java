import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Integer> itemsMap = new LinkedHashMap<>();

        itemsMap.put("shards",0);
        itemsMap.put("fragments",0);
        itemsMap.put("motes",0);

        while (true) {

            String[] commandArr = scanner.nextLine().split("\\s+");

            for (int i = 1; i < commandArr.length; i++) {
                if (i % 2 != 0) {
                    String itemLow = commandArr[i].toLowerCase();

                    if (!itemsMap.containsKey(itemLow)){
                        itemsMap.put(itemLow,Integer.parseInt(commandArr[i-1]));
                    } else {
                        itemsMap.put(itemLow,itemsMap.get(itemLow) + Integer.parseInt(commandArr[i-1]));
                        if (itemsMap.get("shards") >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            itemsMap.put("shards",itemsMap.get("shards") - 250);
                            for (Map.Entry<String, Integer> ent : itemsMap.entrySet()) {
                                System.out.printf("%s: %d%n",ent.getKey(),ent.getValue());
                            }
                            return;

                        } else if (itemsMap.get("fragments") >= 250) {
                            System.out.println("Valanyr obtained!");
                            itemsMap.put("fragments",itemsMap.get("fragments") - 250);
                            for (Map.Entry<String, Integer> ent : itemsMap.entrySet()) {
                                System.out.printf("%s: %d%n",ent.getKey(),ent.getValue());
                            }
                            return;

                        } else if (itemsMap.get("motes")>=250) {
                            System.out.println("Dragonwrath obtained!");
                            itemsMap.put("motes",itemsMap.get("motes") - 250);
                            for (Map.Entry<String, Integer> ent : itemsMap.entrySet()) {
                                System.out.printf("%s: %d%n",ent.getKey(),ent.getValue());
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
