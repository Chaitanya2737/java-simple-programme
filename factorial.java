import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usernumber = sc.nextInt();
        int f=1;
        for(int i=1; i<=usernumber;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}
