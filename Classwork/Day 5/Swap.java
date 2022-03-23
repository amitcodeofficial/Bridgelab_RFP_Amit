import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of a=");
        int a = scan.nextInt();

        System.out.print("Enter the value of b=");
        int b = scan.nextInt();

        int temporary;
        temporary = a;
        System.out.println("Temporary value="+temporary);
        a=b;
        System.out.println(a);
        b=temporary;

        System.out.println();
        System.out.println("The value of a after swaping is="+a);
        System.out.println("The value of b after swaping is="+b);
    }
}
