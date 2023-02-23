import java.util.Scanner;
class Example1{  
  public static void main(String args[]){     
    int arr[]={23,78,4,220,56,33};  //100       
    Scanner s=new Scanner(System.in);        
    int count=0,index=-1;      
    System.out.println("Enter key value"); //4      
    int key=s.nextInt();      
    for(int i=0;i<arr.length;i++){         
      if(key==arr[i]){             
        count++;              
        index=i;   //3              
        break;        }      }      
    if(count>0){        
      System.out.println(key+" is present in "+index+ "index position");      
    }    
    else{      
      System.out.println(key+" is not present in array");    }          }}
