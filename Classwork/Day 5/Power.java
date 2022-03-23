import java.util.Scanner;

public class Power{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number=");
        int number = scan.nextInt();
        
        System.out.print("Enter the power=");
        int pow = scan.nextInt();

        int numb=1;
        for(int i=1; i<=pow;i++){
            numb=numb*number;
        }
        System.out.println("Power="+numb);
    }
}