import java.util.*;
class Q6 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int Size = sc.nextInt();

        char arr[] = new char[Size];
        System.out.println("Enter array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Character Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
