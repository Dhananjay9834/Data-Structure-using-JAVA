public class Rhombus{
    public static void drawRhombus(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=(size-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=size;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        drawRhombus(10);
    }
}