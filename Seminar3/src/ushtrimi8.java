import java.util.Scanner;
public class ushtrimi8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("jepni 3 numra");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        double max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }

        System.out.println("maximumi eshte "+max);
    }

}
