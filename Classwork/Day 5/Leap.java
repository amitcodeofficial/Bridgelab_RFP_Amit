import java.util.Scanner;

public class Leap{

    public static void calculate(int year){
        if((year%400 == 0) || ((year%4==0) && (year%100 !=0))){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Program to check whether year is leap or not.");
        System.out.print("Enter the year=");
        int year = scan.nextInt();

        Leap.calculate(year);
    }
}