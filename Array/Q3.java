import java.util.*;
class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int Size = sc.nextInt();
         
        int arr[] = new int[Size];

        System.out.println("Enter Array Elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            
        
      }
      System.out.println(" Even Elements in array are :");
      for(int i = 0; i < arr.length; i++){
        if(arr[i]%2 == 0){
            System.out.println( arr[i]);
          }
      }
      
      
    }
}
