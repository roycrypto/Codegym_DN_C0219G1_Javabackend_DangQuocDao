import java.util.Scanner;

public class lenhIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your score: ");
        int score = sc.nextInt();
        if (score < 0) {
            System.out.println("Failed bitch");
        }
        else if ( score < 5.5) {
            System.out.println("Your grade is: D");
        }
        else if ( score < 7) {
            System.out.println("Your grade is: C");
        }
        else if ( score < 8.5) {
            System.out.println("Your grade is: B");
        }
        else {
            System.out.println("Your grade is: A");
        }
    }
}

