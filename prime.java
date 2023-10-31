public class prime {
    public static void main(String[] args) {
        int a=1;
        int flag=0;

        if (a<=1){
            System.out.println(a+"is not prime");
        }
        for(int i= 2; i<=a/2;i++){
            if (a%i==0) {
                flag=1;
            }
        }
        if (flag==0) {
            System.out.println(a+"is prime number");
        }
        else{
            System.out.println(a+"is not prime");
        }
        int abc = 5%5;
        System.out.println(abc);
    }
}
