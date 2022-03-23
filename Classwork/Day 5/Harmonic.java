import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to get the Harmonic=");
        int number = scanner.nextInt();

        for(int i=1;i<=number;i++) {
              System.out.print("1/"+i);
              if(i != number){
                System.out.print("+");
              }
              
        }
    }
}
