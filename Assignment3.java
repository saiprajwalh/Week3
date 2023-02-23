import java.util.Arrays;

public class Assignment3 {

    public static void main(String args[]) {

        int[] arr = {23,45,67,78,45,7,90,22};

        // Ascending order
        Arrays.sort(arr);
        System.out.println("Ascending order: " + Arrays.toString(arr));

        // Descending order
        int[] arrDesc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDesc[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Descending order: " + Arrays.toString(arrDesc));
    }
}