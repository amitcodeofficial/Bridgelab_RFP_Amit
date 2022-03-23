import java.util.Scanner;

public class EvenOrOdd {

    public static void check(int number){
        if(number%2==0){
            System.out.println(number+" is a Even number.");
        }else{
            System.out.println(number+" is a Odd number.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to Check whether number is even or not.");
        System.out.println();

        System.out.print("Enter a number=");
        int number = scan.nextInt();

        EvenOrOdd.check(number);
    }
}
