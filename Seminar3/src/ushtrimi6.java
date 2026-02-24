import java.util.Scanner;

public class ushtrimi6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ora;
        System.out.println("jepni nje numer");
        ora=sc.nextInt();

        if(ora<12){
            System.out.println("eshte mengjes");
        } else if (ora==12) {
            System.out.println("eshte mesdite");
        }  else if (ora>12 && ora<18) {
            System.out.println("eshte pasdite");
        }    else System.out.println("eshte mbremje");
    }
}
