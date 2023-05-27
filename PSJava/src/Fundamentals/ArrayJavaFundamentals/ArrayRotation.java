import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= rotations; i++) {


            int firstelement = nums[0];

            for (int j = 0; j < nums.length - 1; j++)

                nums[j] = nums[j + 1];

            nums[nums.length - 1] = firstelement;
        }


        for (int j = 0; j < nums.length; j++) {

            System.out.printf("%d ", nums[j]);
        }

    }
}
