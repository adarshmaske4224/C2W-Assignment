
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int Size = sc.nextInt();
        
        int arr[] = new int[Size];
        System.out.println("Enter Elements of array:");
        for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
