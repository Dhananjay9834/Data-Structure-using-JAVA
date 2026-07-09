import java.util.*;
public class EvenOddSum
{
    
    public static void main(String args[])
    {
        int n,choice,EvenSum=0,OddSum=0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter Number : ");
            n = sc.nextInt();

            if(n % 2 == 0)
                EvenSum+=n;
            else
                OddSum+=n;
            
            System.out.println("Do you want to continue 0 for yes , 1 for no.");
            choice = sc.nextInt();
        }while(choice==0);

        System.out.println("Sum of EVEN Numbers : "+EvenSum);
        System.out.println("Sum of ODD Numbers  : "+OddSum);
    }
}