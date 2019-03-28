import java.util.Scanner;

public class phuongTrinhBacHai {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input each value of ax + by + c = 0");
        System.out.println("Value of a: ");
        a = sc.nextInt();
        System.out.println("Value of b: ");
        b = sc.nextInt();
        System.out.println("Value of c: ");
        c = sc.nextInt();

        int delta = (b*b - (4*a*c));

        if (delta <0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta ==0) {
            System.out.println("Phuong trinh co nghiem kep la: " + -b/2*a);
        }
        else {
            System.out.println("Phuong trinh co 2 nghiem la: " + (-b + Math.sqrt(delta))/2*a + " and " + (-b - Math.sqrt(delta))/2*a
        );
        }
    }
}
