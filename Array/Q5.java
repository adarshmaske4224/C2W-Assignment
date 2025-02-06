import java.util.*;

class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int Size = sc.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter Elements Of array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            // arr[i] = sc.nextInt();
            if(arr[i]<10){
                System.out.println(arr[i]+"is less than 10");

            }
        }
        
    }
}
