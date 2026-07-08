import java.util.*;
public class LeafYear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        String result = (year%4==0)?"LEAF year":"not LEAF year";
        System.out.println("Entered Year is "+result);
    }
}