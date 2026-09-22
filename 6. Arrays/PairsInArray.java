public class PairsInArray{
    public static void displayPairs(int array[]){
        int pairs = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs : " + pairs);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        displayPairs(arr);
    }
}