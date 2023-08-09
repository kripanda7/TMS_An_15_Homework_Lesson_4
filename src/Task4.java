import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please, enter the array's length:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        while (arrayLength < 6 || arrayLength > 10) {
            System.out.println("The entered number should be rather then 5 and less or equals 10.");
            System.out.println("Please, enter the array's length:");
            arrayLength = scanner.nextInt();
        }
        int[] array = new int[arrayLength];
        int array2Length = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) {
                array2Length++;
            }
        }
        System.out.println("Generated array: " + Arrays.toString(array));
        int[] array2 = new int[array2Length];
        for (int value : array) {
            if (value % 2 == 0) {
                for (int i = 0; i < array2.length; i++) {
                    if (array2[i] == 0) {
                        array2[i] = value;
                        break;
                    }
                }
            }
        }
        System.out.println("Array with only even values: " + Arrays.toString(array2));
    }
}
