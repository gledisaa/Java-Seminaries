import java.util.Scanner;

public class ushtrimi16 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("pini:");
        boolean rez=true;

        for(int i=0;i<4;i++){
            String pin=sc.nextLine();
            if(pin.equals("1234")){
                rez=true;
                break;
            }
        }

        if(rez==true){
            System.out.println("PIN është i saktë");
        } else System.out.println("karta juaj eshte bllokuar");

    }
}
