import java.util.Scanner;

public class ushtrimi9 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("distanca eshte");
            int distanca=sc.nextInt();
            sc.nextLine();
            System.out.println("orari eshte");
            String orari= sc.nextLine();

            double pagesa;
            if(orari.equals("dite")){
                pagesa=distanca*0.5;
            }
            else{
                pagesa=distanca*0.7;
            }

            System.out.println("pagesa eshte "+pagesa);

    }

}
