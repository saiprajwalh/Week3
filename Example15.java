import java.util.Scanner;
 
public class Example15 {
 
    public static void main(String[] args) {
        int count, i, num, index;
        int input[] = new int[100];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements in Array");
        count = scanner.nextInt();
 
        System.out.println("Enter " + count + " Numbers");
        for (i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }
 
        System.out.println("Enter Number to be Inserted");
        num = scanner.nextInt();
        System.out.println("Enter Index of Insertion");
        index = scanner.nextInt();
 
        for (i = count; i > index; i--) {
            input[i] = input[i - 1];
        }
     
        input[index] = num;
        
        count++;
    
 