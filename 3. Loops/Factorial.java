import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        int factorial = 1;
        int cnt=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        do{
            factorial*=cnt;
            cnt++;
        }while(cnt<=n);

        System.out.println("Factorial = "+factorial);
    }
}