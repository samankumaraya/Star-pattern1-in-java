package RightTrianglePattern;

public class Main {

    public static void main(String[] args) {
       int i,j,row=10;

       for(i=0;i<row;i++){
           for(j=0;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
