public class DecimalToBin{
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int BinNum = 0;
        while(n>0)
        {
            int rem = n % 2;
            BinNum += (rem * Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of "+ myNum +" = "+BinNum);
    }
    public static void main(String args[]){
        decToBin(19);
    }
}