//marks array
//OOP - 98
//M3 - 60
//DS - 80
//DSGT - 60
//ADE - 90

import java.io.*;
public class Q10 {
    public static void main(String[] args)throws IOException{
      
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Size Of array:");
        int Size = Integer.parseInt(br.readLine());

        int arr[] = new int[Size];
        System.out.println("Enter Subject Marks:");
        for (int i = 0; i < Size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
         
        for (int i = 0; i < Size; i++) {
            System.out.println("Marks are:"+arr[i]);
        }
       
    }
}
