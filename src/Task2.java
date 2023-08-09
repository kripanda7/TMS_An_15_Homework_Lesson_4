import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please, enter the array's length:");
        int arrayLength = new Scanner(System.in).nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Generated array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Max value: " + array[arrayLength - 1]);
        System.out.println("Min value: " + array[0]);
        System.out.println("Average value: " + Arrays.stream(array).sum() / arrayLength);
    }
}
