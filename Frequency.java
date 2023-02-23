import java.util.Scanner;
class Example1{  
  public static void main(String args[]){     
    int arr[]={23,78,4,220,23,34,23,56,33};        
    Scanner s=new Scanner(System.in);        
    int count=0;     
    System.out.println("Enter key value");       
    int key=s.nextInt();  //23      
    for(int i=0;i<arr.length;i++){         
      if(key==arr[i]){             
        count++;       
      }      }     
    if(count>0){        
      System.out.println(key+" frequency is : "+count);      
    }    
    else{      
      System.out.println(key+" is not present in array");    
    }          
  }}