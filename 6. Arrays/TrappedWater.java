public class TrappedWater{
    public static int trapWater(int height[]){
        int n = height.length;
        //Max height of left side
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i=1;i<n;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
    
        //Max height of right side
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i] = Math.max(height[i],maxRight[i+1]);
        }

        //Loop
        int trappedwater = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(maxLeft[i],maxRight[i]);
            trappedwater += waterlevel - height[i];          
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,4};
        System.out.println("Trapped water = "+trapWater(height));
    }
}