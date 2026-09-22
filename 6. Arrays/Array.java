import java.io.*;
import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}