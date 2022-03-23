import java.util.Scanner;
import java.lang.Math.*;

public class Quadratic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to find roots of quadratic equation of a*x*x+b*x+c");
        System.out.println();

        System.out.print("Enter the value of a=");
        double a = scan.nextDouble();
        
        System.out.print("Enter the value of b=");
        double b = scan.nextDouble();
        
        System.out.print("Enter the value of c=");
        double c = scan.nextDouble();

        System.out.println();
        System.out.println("The Quadractic Equation is "+a+"*x*x+"+b+"*x"+c);
        System.out.println("Now to find Roots of quadratic equation");

        System.out.println();
        System.out.println("Formula for delta is ((b*b) - (4*a*c))");
        System.out.println("Now to Calculate Delta:");
        double delta = ((b*b) - (4*a*c));
        System.out.println("( ("+b+"*"+b+") - (4*"+a+"*"+c+") ) = "+delta);
        System.out.println(delta+" is Delta");

        System.out.println();
        System.out.println("Formula for Root1 of x is ((-b) + (sqrt(delta)))/(2*a)");
        double Root1 = ((-b) + (Math.pow(delta,0.5)))/(2*a);
        System.out.println("( (-"+b+") + \u221A"+delta+") )/(2*"+a+") = "+Root1);
        System.out.println(Root1+" is Root 1 of x");

        System.out.println();
        System.out.println("Formula for Root1 of x is ((-b) + (sqrt(delta)))/(2*a)");
        double Root2 = ((-b) - (Math.pow(delta,0.5)))/(2*a);
        System.out.println("( (-"+b+") - \u221A"+delta+") )/(2*"+a+") = "+Root2);
        System.out.println(Root2+" is Root 2 of x");
    }
}
