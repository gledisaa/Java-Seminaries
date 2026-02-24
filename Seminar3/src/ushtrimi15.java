import java.util.Scanner;

public class ushtrimi15 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("emri:");
        String emri=sc.nextLine();
        System.out.println("paga per ore:");
        int ora=sc.nextInt();
        System.out.println("sa ore keni punuar naten e kaluar");
        int java=sc.nextInt();
        double paga;
        if(java>40){
            paga=(ora*40)+((ora*1.5)*(java-40));
        }
        else paga=ora*java;

        System.out.println("paga juaj ehste "+ paga);

    }
}
