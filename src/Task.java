import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int[] array = {1, 23, 456, 7890};
        Arrays.sort(array);
        if (Arrays.binarySearch(array, new Scanner(System.in).nextInt()) >= 0) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }
    }
}
