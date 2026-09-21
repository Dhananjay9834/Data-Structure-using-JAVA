import java.util.*;
public class Palindrome
{
    public static boolean isPalindrome(int n){
        int num = n;
        int rev=0;
        while(n>0){
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n=n/10;
        }
        if(num == rev){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n+" is Palindrome!");
        }else{
            System.out.println(n+" is not Palindrome!");
        }
    }
}
