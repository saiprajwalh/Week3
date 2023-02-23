//int arr[]={23,45,65,78,90,34,22}
//enter new value:100
//{100,23,45,65,78,90,34,22}
//insert an element in first index position
import java.util.Scanner;
 
class Example1 {
 
  Scanner s = new Scanner(System.in);
  int arr[] = new int[100];
  int no_elements = 0;
 
  public void insertFirst() {
     System.out.println("Enter your value to insert in first index ");
      int num=s.nextInt();  //50
      if(no_elements==0){   // if array is empty
        arr[0]=num;
        no_elements++;
      }
       else{ 
           for(int i=no_elements;i>0;i--){           //10
             arr[i]=arr[i-1];
           }
            arr[0]=num;
             no_elements++;
        }
  }
  public void display(){
   for(int i=0;i<no_elements;i++){
     System.out.print(arr[i]+" ");
   } 
    viewOptions();
  }
 
  public void viewOptions() {
    System.out.println("1. Insert an element in first index position");
    System.out.println("choose your option");
    int option=0;
    do{
    option=s.nextInt();
    switch(option){
      case 1:
        {
          insertFirst();
          display();
        }
    }
    }
      while(option!=0);
  }
 
  public static void main(String args[]) {
 
    Example1 obj = new Example1();
    obj.viewOptions();
 
  }
}