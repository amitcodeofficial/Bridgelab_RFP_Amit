import java.util.Scanner;

public class Factors {

    public static void factor(int number){
        System.out.print("Factors of "+number+" are:");
        for(int i=1;i<=number;i++){
            if(number%i ==0){
                System.out.print(" "+i);
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to find factors of N numbers");

        System.out.print("Enter the number to get factors=");
        int number = scan.nextInt();

        Factors.factor(number);
    }
}
