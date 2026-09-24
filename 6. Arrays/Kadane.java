// Maximum array sum
//Bruit Kadane Algo method
import java.util.*;
import java.io.*;
public class Kadane
{
    public static int maxSumByKadane(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i = 0; i<arr.length;i++)
        {
            currSum += arr[i];
            if(currSum<0){ currSum = 0;}
            maxSum = Math.max(maxSum,currSum);
        } 
        return maxSum;
    }

    public static void main(String args[])
    {
        int arr[] = {2,3,1,5,6,-2,-3,1};
        System.out.println("Maximum Sum of subarray = " + maxSumByKadane(arr));
    }
}