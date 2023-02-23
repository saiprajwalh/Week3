class Example7{  
  public static void main(String args[]){     
    int arr[]={23,78,4,220,23,34,23,56,33};           
    int positive[]=new int[arr.length];       
    int negative[]=new int[arr.length];        
    int positiveIndex=-1,negativeIndex=-1;      
    for(int i=0;i<arr.length;i++){        
      if(arr[i]>0){          
        positive[++positiveIndex]=arr[i];        
      }       
      else{          
        negative[++negativeIndex]=arr[i];       
      }      
    }     
    System.out.println("positive values are: ");      
    for(int i=0;i<=positiveIndex;i++){        
      System.out.print(positive[i]+" ");      
    }         
    System.out.println("\nnegative values are: ");      
    for(int i=0;i<=negativeIndex;i++){        
      System.out.print(negative[i]+" ");      
    }           
  }
}