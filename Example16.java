import java.util.Arrays;
 
public class Example16 {
    public static void main(String[] args) {
        int arr[] = {23,45,65,78,90,34,22};
        int element = 7;
 
        int newArr[] = Arrays.copyOf(arr, arr.length + 1); 
        newArr[arr.length] = element;
 
        System.out.println("Original  : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(newArr));
    }
}