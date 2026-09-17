public class ProperDiamond{
    public static void drawDiamond(int size){
        //for Upper Triangle
        for(int i=1;i<=size;i++){
            for(int j=1;j<=(size-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for Lower Triangle
        for(int i=size;i>=1;i--){
            for(int j=1;j<=(size-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        drawDiamond(8);
    }
}