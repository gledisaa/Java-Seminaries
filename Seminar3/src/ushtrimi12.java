import java.util.Scanner;

public class ushtrimi12 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double a,b,rez=0;
        System.out.println("jepni dy numra: ");
        a=sc.nextDouble();
        b= sc.nextDouble();
        char c;
        System.out.println("jepni nje operator: ");
        c=sc.next().charAt(0);

        switch (c){
            case '+':
               rez=a+b;
               break;
            case '-':
                rez=a-b;
                break;
            case '*':
                rez=a*b;
                break;
            case '/':
                rez=a/b;
                break;
        }
        System.out.println("rezultati eshte "+rez);
    }
}
