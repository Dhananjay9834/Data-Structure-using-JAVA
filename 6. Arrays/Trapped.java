//Trapped Water
import java.util.*;
import java.io.*;
public class Trapped
{
    public static int trappedWater(int arr[])
    {
        //left max boundary
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        //Right max boundary
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        //find Trapped water
        int trapped = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trapped += waterLevel-arr[i];
        }
        return trapped;
    }

    public static void main(String args[])
    {
        int arr[] = {4,2,0,6,3,2,4};
        System.out.println("Trapped Water = " + trappedWater(arr));
    }
}