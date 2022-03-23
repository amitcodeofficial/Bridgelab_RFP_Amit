import java.util.Scanner;

public class Flip {

    static int heads=0;
    static int tails=0;

    public static int random(){
        int min=0;
        int max=1;

        double r=Math.random()*(max-min+1)+min;
        int ra=(int) r;
        return ra;
    }
    public static void flipcoin(int randomN){
        if(randomN < 0.5){
            System.out.println("Tails");
            tails++;
        }else{
            System.out.println("Heads");
            heads++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to flip coin=");
        int number = scan.nextInt();

        for(int i=1;i<=number;i++){
            int randomN = random();
            flipcoin(randomN);
        }

        System.out.println("Heads="+heads);
        System.out.println("Tails="+tails);
    }
}
