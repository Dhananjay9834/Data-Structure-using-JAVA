import java.util.*;
public class SumOfDigit{
    public static void sumOfDigit(int n){
        int num = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum+=rem;
            n = n / 10;
        }
        System.out.println("The Sum of Digits of "+ num +" = "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        sumOfDigit(num);
    }
}
