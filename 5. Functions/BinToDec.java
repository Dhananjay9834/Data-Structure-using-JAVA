public class BinToDec{
    public static void binToDec(int n){
        int myNum = n;
        int pow = 0;
        int DecNum = 0;
        while(n>0)
        {
            int lastDigit = n % 10;
            DecNum += (lastDigit * Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal form of "+ myNum +" = "+DecNum);
    }
    public static void main(String args[]){
        binToDec(10000);
    }
}
