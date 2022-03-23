import java.util.Scanner;

public class QuotientAndRemainder {

    public static void compute(int dividend, int divisor){
        int quotient = dividend/divisor;
        System.out.println("The quotient is="+quotient);

        int remainder = dividend % divisor;
        System.out.println("The remainder is="+remainder);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to Compute Quotient and Remainder");

        System.out.print("Enter the Dividend=");
        int dividend = scan.nextInt();
        
        System.out.print("Enter the Divisor=");
        int divisor = scan.nextInt();

        QuotientAndRemainder.compute(dividend, divisor);
    }
}
