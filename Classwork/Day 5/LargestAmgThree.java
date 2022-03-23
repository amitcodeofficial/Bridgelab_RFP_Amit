import java.util.Scanner;

public class LargestAmgThree {

    public static void findlargest(int number1, int number2, int number3){
        if((number1>number2) && (number1>number3)){
            System.out.println(number1+" is the largest number amongst three numbers.");
        }else if((number2>number1) && (number2>number3)){
            System.out.println(number2+" is the largest number amongst three numbers.");
        }else if((number1 == number2) && (number1 == number3) && (number2 == number3)){
            System.out.println(number1+" is the same number amongst these three.");
        }else{
            System.out.println(number3+" is the largest number amongst three numbers.");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program t find the Largest among three number.");
        System.out.println();

        System.out.print("Enter the number1=");
        int number1 = scan.nextInt();
        
        System.out.print("Enter the number2=");
        int number2 = scan.nextInt();
        
        System.out.print("Enter the number2=");
        int number3 = scan.nextInt();

        LargestAmgThree.findlargest(number1, number2, number3);
    }
}
