import java.util.Scanner;
public class Reverse
{
    public static void rever(int number){
        int rem,rev=0;
        while(number!=0){
            rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        System.out.println("Reverse of number is="+rev);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Give number=");
        int number = input.nextInt();
        
        rever(number);
    }
}
