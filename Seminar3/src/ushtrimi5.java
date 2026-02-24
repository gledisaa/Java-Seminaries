import java.util.Scanner;

public class ushtrimi5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("jepni noten:");
        String nota = sc.nextLine();

        double a=1;
        switch (nota){
            case "A+":
                a=4;
                break;
            case "A-":
                a=3.7;
                break;
            case "B-":
                a=3.3;
                break;
            case "B+":
                a=2.7;
                break;
            case "C-":
                a=1.7;
                break;
            case "C+":
                a=2.3;
                break;
            case "D+":
                a=1.3;
                break;
            case "D-":
                a=0.7;
                break;
            case "F":
                a=0;
                break;
        }
        System.out.println("nota juaj eshte "+ a);
    }
}
