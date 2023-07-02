import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        LinkedHashMap<String, List<Double>> orderMap = new LinkedHashMap<>();


        while (!command.equals("buy")) {

            String[] commandArr = command.split(" ");

                String order = commandArr[0];
                double price = Double.parseDouble(commandArr[1]);
                double count = Double.parseDouble(commandArr[2]);

                if (!orderMap.containsKey(order)){
                    orderMap.put(order,new ArrayList<>());
                    orderMap.get(order).add(0,price);
                    orderMap.get(order).add(1,count);
                } else {
                   orderMap.get(order).set(1,orderMap.get(order).get(1)+count);
                   orderMap.get(order).set(0,price);
                }


                command = scanner.nextLine();


        }

        for (Map.Entry<String, List<Double>> ent : orderMap.entrySet()) {

            System.out.printf("%s -> %.2f%n",ent.getKey(),ent.getValue().get(0)*ent.getValue().get(1));

        }


    }
}
