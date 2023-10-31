public class palindrome {


    public static void main(String[] args) {
        int a= 3443;
        int temp,r ,sum=0;
        temp=a;

        while (a>0) {
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        if (temp==sum) {
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }
    }
}
