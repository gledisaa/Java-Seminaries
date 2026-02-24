import java.util.Scanner;

public class ushtrimi13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("jepni vitin");
        a = sc.nextDouble();
        if (a % 4 == 0) {
            System.out.println("viti eshte i brishte");
        }
        System.out.println("viti nuk eshte i brishte");
    }
}
