import java.util.Scanner;

public class dowhiletask {

    public static void main(String[] args) {
        char yes;

        Scanner sc = new Scanner(System.in);
        do {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);

            System.out.println("Do you want continue y/n :");
            yes = sc.next().charAt(0);
        } while (yes == 'y' || yes == 'Y');
        sc.close();
    }
}
