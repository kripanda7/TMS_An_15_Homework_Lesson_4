import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 23, 456, 7890};
        int[] modifiedArray = Arrays.copyOf(array, 4);
        System.out.println("Initial array: " + Arrays.toString(array));
        int enteredNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < modifiedArray.length; i++) {
            if (modifiedArray[i] == enteredNumber) {
                modifiedArray[i] = 0;
            }
        }
        if (Arrays.compare(array, modifiedArray) != 0) {
            System.out.println("Modified array without number " + enteredNumber
                    + ": " + Arrays.toString(modifiedArray));
        } else {
            System.out.println("The number " + enteredNumber + " is not found in array.");
        }
    }
}
