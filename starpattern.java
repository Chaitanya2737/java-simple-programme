public class starpattern {

    public static void reversestar(){
        for(int a= 1 ;  a<=7 ;a++){
            for (int b=7; b>=a; b--){
                System.out.print("*");
            }
             System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        for(int a= 1 ;  a<=7 ;a++){
            for (int b=2; b<=a; b++){
                System.out.print("*");
            }
             System.out.println(" ");
        }
        reversestar();
    }
}
