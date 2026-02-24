import java.util.Scanner;
public class Ushtrimi2 {
    public static void main(String[] args){
        int a;
        System.out.println("vendosni numrin.");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int i=10;
        int rez=1;
        while(Math.abs(a)>i){
        rez++;
        i=i*10;
        }
        System.out.println("numri i dhene ka "+rez+" shifra");
    }
}
