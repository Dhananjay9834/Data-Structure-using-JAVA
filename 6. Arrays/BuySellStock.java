public class BuySellStock{
    public static int buyAndSell(int prize[]){
        int maxProfit = 0;
        int buyPrize = Integer.MAX_VALUE;
        for(int i=0;i<prize.length;i++){
            if(buyPrize < prize[i]){
                int profit = prize[i] - buyPrize;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrize = prize[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prize[] = {1,7,5,4,4,3,7,1};
        System.out.println("Maximum Profit = "+buyAndSell(prize));
    }
}