import java.lang.Math.*;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to find the Euclidean distance from the point(x, y) to origin (0, 0).");
        System.out.println("Now we Take two inputs values of x and y from user to find distance.");

        System.out.println();
        System.out.print("Enter the value of x=");
        int x = scan.nextInt();
        
        System.out.print("Enter the value of y=");
        int y = scan.nextInt();

        System.out.println();
        System.out.println("Now the points are ("+x+", "+y+")  and we can find Distance to origin (0, 0).");

        System.out.println();
        System.out.println("Formula to find Distance is distance=\u221A(x*x + y*y)");
        System.out.println("Now we calculate Distance:");
        double distance = Math.pow(( (x*x) + (y*y) ),0.5);
        System.out.println("distance=\u221A( ("+x+"*"+x+") + ("+y+"*"+y+") ) = "+distance);
        System.out.println();
        System.out.println(distance+" is the distance from the points ("+x+", "+y+") to origin (0, 0).");
        System.out.println();
    }
}
