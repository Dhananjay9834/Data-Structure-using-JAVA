import java.util.*;
public class SwitchCase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3: 
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5: 
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7: 
                System.out.println("SATURDAY");
                break;
            default:
                    System.out.println("Enter valid number");
        }
    }
}