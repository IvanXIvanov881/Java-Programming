import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> ent : words.entrySet()) {
            System.out.printf("%s - %s%n",ent.getKey(),ent.getValue().toString().replace("[", "").replace("]", ""));
        }


    }
}
