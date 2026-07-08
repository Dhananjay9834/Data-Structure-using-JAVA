import java.util.*;
/* EVEN/ODD number
public class IfElse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers : ");
        int A = sc.nextInt();
        if(A%2==0){
            System.out.println("Number is EVEN");
        }else{
            System.out.println("Number is ODD");
        }  
    }
}
*/
 //EVEN/ODD number
public class IfElse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numbers : ");
        int A = sc.nextInt();
        if(A>0){
            System.out.println("Number is POSITIVE");
        }else if(A<0){
            System.out.println("Number is NEGATIVE");
        }else{
            System.out.println("Zero is neighter Positive nor Negative");
        }
    }
}