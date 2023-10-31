import java.util.Scanner;

public class isprime {
    public static  boolean isprime(int a ){   
        if (a<=1) {
            return false;
        } 
         if (a<=3){
            return true;
         }
         for (int i = 5; i * i <= a; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       System.out.println(isprime(num));
       for(int i=1; i<=50; i++){
        if (isprime(i)) {
        //    System.out.println(i);
        }
       }
    }
}
