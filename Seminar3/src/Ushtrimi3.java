import java.util.Scanner;

public class Ushtrimi3 { public static void main(String[] args){
    int a,b,c;
    System.out.println("vendosni numrin.");
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && b>c){
        System.out.println("numrat jane ne rendin zbites");
    }
    else if(a<b && b<c){
        System.out.println("numrat jane ne rendin rrites");
    }
    else
        System.out.println("numrat nuk jane te renditur");
}
}
