import java.util.*;
class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of array : ");
        int Size = sc.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter array elements :");
        for(int i = 0; i < Size;  i++){
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < Size;  i++){
            
            if(arr[i]%4==0){
            System.out.println(arr[i]+" is divisible by 4..!");
            }
            
        }
    }
}
