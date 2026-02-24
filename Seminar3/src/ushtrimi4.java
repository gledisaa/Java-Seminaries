import java.util.Scanner;
public class ushtrimi4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("jepni cmimim:");
        double a = sc.nextDouble();

        if(a<100){
            System.out.println("nuk ka zbritje");
        }
        else if (a<500){
            System.out.println("zbritja 10%");
            a =a-(a*0.1);
            System.out.println("cmimi eshte "+a);
        }
        else{  a=a-(a*0.2);
        System.out.println("cmimi eshte "+a);}
    }
}
