import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  length = sc.nextInt() ;
        int  width = sc.nextInt();
        final int fixed=2;
        int result= fixed*(length+width);
        System.out.println("perimeter of rectangle is " +result);
        System.out.println("area of rectangle is " + length*width );
    }
}
