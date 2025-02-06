import java.util.*;
class Q4 {
    public static void main(String[ ] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int Size = sc.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter array Elements :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum = sum + arr[i];

            }
        }
        System.out.println( "Sum Of Odd elements In array : "+sum);


    }
}
