import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Initial array: " + Arrays.toString(array));
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }
        System.out.println("Modified array: " + Arrays.toString(array));
    }
}
