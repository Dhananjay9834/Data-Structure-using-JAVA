public class ReverseArray{
    public static void reverse(int array[]){
        int first = 0, last = array.length-1;
        while(first < last){
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
        }
    }
    public static void main(String args[]){
        int arr[]={11,12,23,34,98};
        System.out.print("\nArray elements before reverse : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Reverse Array
        reverse(arr);
        System.out.print("\nArray elements after reverse : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}