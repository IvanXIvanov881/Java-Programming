import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputLine = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        TreeMap<Integer, Integer> numb = new TreeMap<>();


        for (int i = 0; i < inputLine.length; i++) {
            int correctNum = inputLine[i];
            if (!numb.containsKey(correctNum)) {
                numb.put(correctNum, 1);
            } else {
                for (Map.Entry<Integer, Integer> entry : numb.entrySet()) {
                    int correctValue = entry.getValue();
                    if (entry.getKey().equals(correctNum)) {
                        numb.put(correctNum, correctValue + 1);
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> outPut : numb.entrySet()) {
            System.out.printf("%d -> %d%n", outPut.getKey(), outPut.getValue());
        }


    }
}
