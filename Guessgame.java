import java.util.Scanner;
public class Guessgame {
    public static int numberGenrator() {
        int a = (int) (Math.random() * 100);
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        System.out.println("welcome..!  into my guess game");
        Scanner sc = new Scanner(System.in);
        int num = numberGenrator();
        for (int i = 1; i <= num; i++) {
            int userGuess = sc.nextInt();
            if (num == userGuess) {
                System.out.println(" Correct Guess.  you got it in " + i + " guesses");
                return;
            } else if (num > userGuess) {
                System.out.println("too low..! , try again");
            } else if (num < userGuess) {
                System.out.println("too high..! , try again");
            } else {
                System.out.println("invalid input");
            }
        }
        sc.close();
    }
}
