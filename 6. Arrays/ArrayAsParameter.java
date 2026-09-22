import java.io.*;
import java.util.*;
public class ArrayAsParameter{
    public static void insertArray(int array[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
    }
    public static void main(String args[]){
        int arr[] = new int[10];
        insertArray(arr);
        System.out.print("\nArray elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}