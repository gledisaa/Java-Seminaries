import java.util.Scanner;

public class ushtrimi1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("jepni nje numer");
        a=sc.nextInt();

        if(a>0){
            System.out.println("numri i dhene eshte pozitiv.");
        } else if (a<0) {
            System.out.println("numri i dhene eshte negativ.");
        } else System.out.println("numri i dhene eshte zero.");
    }
}
