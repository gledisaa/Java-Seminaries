import java.util.Scanner;
public class ushtrimi11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("vendosni muajin: ");
        int muaji = sc.nextInt();

        if (muaji == 2) {
            System.out.println("28 ose 29 dite");
        } else if (muaji == 7) {
            System.out.println("31 dite");
        } else if (muaji < 7) {
            if (muaji % 2 == 0)
                System.out.println("30 dite");
            else System.out.println("31 dite");
        }
        else {
            if (muaji % 2 == 0)
                System.out.println("31 dite");
            else System.out.println("30 dite");
        }
    }
}

