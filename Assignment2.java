//DUPLICATE
public class Assignment2{ 
  
    public static void main(String[] args) { 
  
        int arr[] = {23,45,56,23,45,67,44}; 
          
        System.out.println("Duplicate elements in given array: ");  
          
        //Searches for duplicate element 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}