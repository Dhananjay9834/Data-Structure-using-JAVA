public class HollowRhombus{
    public static void drawRhombus(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=(size-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=size;j++){
                if(i == 1 || i == size || j == 1 || j == size){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        drawRhombus(8);
    }
}