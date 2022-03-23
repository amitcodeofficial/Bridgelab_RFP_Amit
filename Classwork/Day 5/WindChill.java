import java.util.Scanner;

public class WindChill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to find WindChill.");

        System.out.println();
        System.out.println("Now the National Weather Service defines the effective temperature (the wind chill) to be in formula:");
        System.out.println("w= 35.74 + 0.6215*t + (0.4275*t - 35.75)*v^0.16");
        System.out.println("NOTE: Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).");

        double t,v;

        System.out.println();
        System.out.print("Enter the value of temperature t (in fahrenheit)=");
        t = scanner.nextDouble();
        while(t>=50){
            System.out.println();
            System.out.println("Please Enter the value of t below 50 range.");
            System.out.print("Enter the value of temperature t (in fahrenheit)=");
            t = scanner.nextDouble();
        }
        
        System.out.println();
        System.out.print("Enter the value of the wind speed v (in miles per hour)=");
        v = scanner.nextDouble();
        while(v<=3 || v>=120){
            System.out.println();
            System.out.println("Please Enter the value of v below 120 and above 3 range.");
            System.out.print("Enter the value of the wind speed v (in miles per hour)=");
            v = scanner.nextDouble();
        }

        System.out.println("Now to values are v="+v+" and t="+t);
        System.out.println("Now we can calculate WindChill.");
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
        System.out.println();
        System.out.println("w = 35.74 + 0.6215*"+t+" + (0.4275*"+t+" - 35.75)*"+v+"^0.16 = "+w);
        System.out.println(w+" is the WindChill value.");
    }
}
