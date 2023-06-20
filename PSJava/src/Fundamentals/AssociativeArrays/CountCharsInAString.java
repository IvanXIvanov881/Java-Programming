import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split(" ");

        LinkedHashMap<Character, Integer> linkedMap = new LinkedHashMap<>();

        for (int i = 0; i<word.length;i++){
            for (int j = 0; j < word[i].length(); j++){

                char letter = word[i].charAt(j);
                linkedMap.putIfAbsent(letter,0);
                linkedMap.put(letter,linkedMap.get(letter)+1);
            }

        }
        for (Map.Entry<Character, Integer> ent : linkedMap.entrySet()) {
            System.out.printf("%c -> %d%n",ent.getKey(),ent.getValue());
        }


    }
}
