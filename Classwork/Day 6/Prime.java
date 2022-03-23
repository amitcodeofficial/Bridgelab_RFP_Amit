import java.util.Scanner;

public class Prime {

    public static void primeornot(int number){
        int temp=0;
        for(int i=1;i<=number;i++) {
            if(number%i==0){
                temp=temp+1;
            }
        }
        if(temp==2){
            System.out.println(number+" number is a prime number.");
        }else{
            System.out.println(number+" number is not a prime number.");
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to check whether the entered number is prime or not.");
        System.out.print("Enter the number=");
        int number = scanner.nextInt();

        primeornot(number);
    }
}
