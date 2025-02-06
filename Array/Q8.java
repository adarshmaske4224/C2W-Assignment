//Employee age array

import java.util.*;
class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Employee age you want to store: ");
        int Size = sc.nextInt();
        
        // int arr[] = new int[Size];
        // System.out.println("Enter Employee Id :");
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
       
        int arr1[] = new int[Size];
        System.out.println("enter Employee age:");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

       for(int i = 0; i < Size; i++){
        System.out.println("employee Ages is :"+arr1[i]);

       }
    }
}
