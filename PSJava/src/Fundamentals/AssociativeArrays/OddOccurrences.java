import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputWordsArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (int i = 0; i < inputWordsArr.length; i++) {
            String wordLowerCase = inputWordsArr[i].toLowerCase();
            inputWordsArr[i] = wordLowerCase;

            wordMap.putIfAbsent(inputWordsArr[i],0);
            wordMap.put(inputWordsArr[i],wordMap.get(inputWordsArr[i])+1);


        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> outputEntry : wordMap.entrySet()) {

            if (outputEntry.getValue() % 2 != 0) {
                resultList.add(outputEntry.getKey());
            }

        }

for(int i = 0; i<resultList.size();i++){
    if (i<resultList.size()-1){
        System.out.printf("%s, ", resultList.get(i));
    } else {
        System.out.printf("%s", resultList.get(i));
    }

}

    }
}
