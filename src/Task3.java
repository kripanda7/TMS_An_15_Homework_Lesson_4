import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 1, 5, 2};

        double averageValue1 = Arrays.stream(array1).sum() / (double) array1.length;
        double averageValue2 = Arrays.stream(array2).sum() / (double) array2.length;
        if (averageValue1 > averageValue2) {
            System.out.println("Average value of the first array grater then the second's.");
        } else if (averageValue1 < averageValue2) {
            System.out.println("Average value of the second array grater then the firth's.");
        } else {
            System.out.println("Average values of two arrays are equal.");
        }
    }
}
