import java.util.Scanner;
public class ushtrimi10 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        char c= sc.next().charAt(0);

        if (!Character.isLetter(c)) {
            System.out.println("gabim");
            return;
        }

        if(!isVouel(c)){
            System.out.println("characteri eshte bashtingellore");
        } else System.out.println("characteri eshte zanore");


    }
public static boolean isVouel(char c){
        c= Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y')
            return true;
        return false;
    }
}


