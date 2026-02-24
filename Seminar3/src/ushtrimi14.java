import java.util.Scanner;
public class ushtrimi14 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Deshironi te vazhdoni");
        String p=sc.nextLine();
        p.toLowerCase();

        if(p.equals("no")||p.equals("n")||p.equals("jo")){
            System.out.println("perfundim");
        } else if (p.equals("yes")||p.equals("y")||p.equals("po")||p.equals("ok")){
            System.out.println("OK");
        } else  System.out.println("Input i gabuar");
    }
}
