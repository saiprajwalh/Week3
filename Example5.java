class Example5 {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter element to search");
    int key=s.nextInt();
    int arr[] = { 23, 34, 56,56,56,78, 56, 44, 87 };
    int count=0;
    for (int i = 0; i < arr.length; i++) {
      if(key==arr[i]){
        count=count+1;
      }
    }
    if(count>=1){
        System.out.println("entered number is present ");
        System.out.println("entered number is present "+count+" times");
      }
      else{
        System.out.println("entered number is not present");
      }
  }