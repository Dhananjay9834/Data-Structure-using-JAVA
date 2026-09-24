// Maximum array sum
//Bruit Force method
import java.util.*;
import java.io.*;
public class MaxSumByBForce
{
    public static int bforce(int arr[])
    {
        int maxSum = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            int start = i;
            for(int j=i;j<arr.length-1;j++)
            {
                int end = j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int arr[] = {2,3,1,5,6,-2,-3,1};
        System.out.println("Maximum Sum of Subarray = " + bforce(arr));
    }
}