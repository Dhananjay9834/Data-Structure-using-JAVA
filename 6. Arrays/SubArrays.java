public class SubArrays{
    public static void printSubarrays(int array[]){
        int count = 0;
        for(int i=0;i<array.length;i++){
            int start = i;
            for(int j=i;j<array.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(array[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Number of Subarrays : " + count);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }
}