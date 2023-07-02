import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsGradeMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGradeMap.containsKey(name)) {
                studentsGradeMap.put(name, new ArrayList<>());
               studentsGradeMap.get(name).add(0,1.0);
               studentsGradeMap.get(name).add(1,grade);
            } else {
                studentsGradeMap.get(name).set(0,studentsGradeMap.get(name).get(0)+1.0);
                studentsGradeMap.get(name).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> ent : studentsGradeMap.entrySet()) {
            double studAverage = 0;
            for (int i = 1; i < ent.getValue().size();i++){
                studAverage = studAverage + ent.getValue().get(i);
            }
            if (studAverage / ent.getValue().get(0) >= 4.50){
                System.out.printf("%s -> %.2f%n",ent.getKey(),studAverage / ent.getValue().get(0));
            }
        }

    }
}
