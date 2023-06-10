import java.util.Scanner;
import java.util.Arrays;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int field = Integer.parseInt(scanner.nextLine());
        int[] fieldArr = new int[field];


        int[] indexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < indexes.length; i++) {

            if (indexes[i] >= 0 && indexes[i] < fieldArr.length) {
                fieldArr[indexes[i]] = 1;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");

            switch (commandArr[1]) {
                case "right":
                    int bugStartPositionRight = Integer.parseInt(commandArr[0]);
                    int bugStopPositionRight = Integer.parseInt(commandArr[2]);
                    if (bugStopPositionRight != 0) {
                        if (bugStartPositionRight >= 0 && bugStartPositionRight < fieldArr.length && fieldArr[bugStartPositionRight] == 1) {
                            if (bugStopPositionRight > 0 && bugStartPositionRight + bugStopPositionRight < fieldArr.length) {
                                for (int i = bugStartPositionRight + bugStopPositionRight; i < fieldArr.length; i++) {
                                    if (fieldArr[i] == 0) {
                                        fieldArr[i] = 1;
                                        break;
                                    }
                                }
                            } else if (bugStopPositionRight < 0 && bugStartPositionRight + bugStopPositionRight >= 0) {
                                for (int i = bugStartPositionRight + bugStopPositionRight; i < fieldArr.length; i++) {
                                    if (fieldArr[i] == 0) {
                                        fieldArr[i] = 1;
                                        break;
                                    }
                                }
                            }
                            if (fieldArr[bugStartPositionRight] >= 0 && fieldArr[bugStartPositionRight] < fieldArr.length) {
                                fieldArr[bugStartPositionRight] = 0;
                            }
                        }

                    }
                    break;

                case "left":
                    int bugStartPositionLeft = Integer.parseInt(commandArr[0]);
                    int bugStopPositionLeft = Integer.parseInt(commandArr[2]);
                    if (bugStopPositionLeft != 0) {
                        if (bugStartPositionLeft >= 0 && bugStartPositionLeft < fieldArr.length && fieldArr[bugStartPositionLeft] == 1) {
                            if (bugStopPositionLeft > 0 && bugStartPositionLeft - bugStopPositionLeft >= 0) {
                                for (int i = bugStartPositionLeft - bugStopPositionLeft; i >= 0; i--) {
                                    if (fieldArr[i] == 0) {
                                        fieldArr[i] = 1;
                                        break;
                                    }
                                }
                            } else if (bugStopPositionLeft < 0 && bugStartPositionLeft - bugStopPositionLeft <= fieldArr.length) {
                                for (int i = bugStartPositionLeft - bugStopPositionLeft; i >= 0; i--) {
                                    if (fieldArr[i] == 0) {
                                        fieldArr[i] = 1;
                                        break;
                                    }
                                }
                            }
                            if (fieldArr[bugStartPositionLeft] >= 0 && fieldArr[bugStartPositionLeft] < fieldArr.length) {
                                fieldArr[bugStartPositionLeft] = 0;
                            }
                        }

                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int cell : fieldArr) {
            System.out.print(cell + " ");
        }
    }
}