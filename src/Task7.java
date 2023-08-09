import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Initial array: " + Arrays.toString(array));
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
