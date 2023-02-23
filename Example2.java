import java.util.Scanner; 
class Example1 {   
  Scanner s = new Scanner(System.in);  
  int arr[] = new int[100];  
  int no_elements = 0;   
  public void insertFirst() {     
    System.out.println("Enter your value to insert in first index ");               
    int num=s.nextInt();  //50      
    if(no_elements==0){   // if array is empty        
      arr[0]=num;        no_elements++;      }       
    else{            
      for(int i=no_elements;i>0;i--){           //10             
        arr[i]=arr[i-1];           }            
      arr[0]=num;             
      no_elements++;        
    }  }  
  public void display(){   
    for(int i=0;i<no_elements;i++){     
      System.out.print(arr[i]+" ");   
    }      }  
  public void insertLast(){    
    System.out.println("Enter your value to insert in last index ");      int num=s.nextInt();       
    if(no_elements==0){         
      arr[0]=num;         
      no_elements++;       
    }    
    else{        
      arr[no_elements]=num;         
      no_elements++;    
    }     
  }   
  public void viewOptions() {   
    int option=0;   
    do{    
      System.out.println("\n1. Insert an element in first index position");   
      System.out.println("2. Insert an element in last index position");    
      System.out.println("0. EXIT");        System.out.println("choose your option");    
      option=s.nextInt();    
      switch(option){      
        case 1:        
          {          
            insertFirst();          
            display();          
            break;        
          }      
        case 2:        
          {          
            insertLast();          
            display();          
            break;      
          }      
        case 0:{        
          System.out.println("Thank you");        
          break;      }    }    }      
      while(option!=0);        }   
  public static void main(String args[]) {     
    Example1 obj = new Example1();    
    obj.viewOptions();   }
}