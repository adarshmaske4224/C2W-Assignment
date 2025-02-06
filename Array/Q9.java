
import java.util.*;
class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int Size = sc.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < Size; i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < Size; i++){
            if(arr[i] % 2 == 0)
            System.out.println(arr[i]+" is an odd Indexed element.");
        }
    }
}