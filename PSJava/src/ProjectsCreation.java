import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1. Името на архитекта - текст
        String name = scanner.nextLine();

        //2. Брой на проектите, които трябва да изготви - цяло число в интервала
        int project = Integer.parseInt(scanner.nextLine());

        //брой проекти = 1 проект е равен на 3 часа
        int finishedprojects = project * 3;

        //3.Принтира "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
System.out.println("The architect " + name + " will need " + finishedprojects + " hours to complete " + project + " project/s.");

    }
}
