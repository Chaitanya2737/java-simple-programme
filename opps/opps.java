package opps;

 class  abcd {
     public Integer a=10;
    public Integer b=10;
} 
 class abcde extends abcd{
     int c= a+b;
     public void show(){
       System.out.println(c); 
     }
 }

 class opps {
    public static void main(String[] args) {
       abcd  ref= new abcd();
    }
}
