import java.util.Scanner;

public class Vending {

    int money;
    static int price;
    public static void choiceok(int choice){
        if(choice == 1){
            Vending.price=20;
        }else if(choice==2){
            Vending.price=30;
        }else if(choice==3){
            Vending.price=60;
        }else if(choice==4){
            Vending.price=80;
        }else if(choice==5){
            Vending.price=100;
        }
    }

    public static void calculation(int cash){
        if(cash==Vending.price){
            System.out.print("You Paid 20 Rs and no change is delivered.");
        }else{
            int return_cash=cash-Vending.price;
            System.out.println("You Paid "+cash+" Rs and "+return_cash+" Rs change is delivered.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to vending machine");
        System.out.println("Please choose a option to buy from one of these:");
        System.out.println("1.Water Bottle-Price=20");
        System.out.println("2.Chips-Price=30");
        System.out.println("3.Sandwitch-Price=60");
        System.out.println("4.Panner Wrap-Price=80");
        System.out.println("5.Cadbury Silk-Price=100");

        System.out.println();
        System.out.print("Enter your choice=");
        int choice = scanner.nextInt();
        choiceok(choice);

        switch (choice) {
            case 1:
            Vending water = new Vending();
            System.out.println("Water Bottle has been choiced.");
            System.out.print("Enter the money to dispense the water bottle=");
            water.money = scanner.nextInt();
            calculation(water.money);
            break;
            case 2:
            Vending chips = new Vending();
            System.out.println("Chips has been choiced.");
            System.out.print("Enter the money to dispense the Chips=");
            chips.money = scanner.nextInt();
            calculation(chips.money);
            break;
            case 3:
            Vending sandwitch = new Vending();
            System.out.println("Sandwitch has been choiced.");
            System.out.print("Enter the money to dispense the sandwitch=");
            sandwitch.money = scanner.nextInt();
            calculation(sandwitch.money);
            break;
            case 4:
            Vending paneer = new Vending();
            System.out.println("Paneer-Wrap has been choiced.");
            System.out.print("Enter the money to dispense the paneer-wrap=");
            paneer.money = scanner.nextInt();
            calculation(paneer.money);
            break;
            case 5:
            Vending silk = new Vending();
            System.out.println("Cadbury silk has been choiced.");
            System.out.print("Enter the money to dispense the Cadbury Silk=");
            silk.money = scanner.nextInt();
            calculation(silk.money);
            break;
        }
    }
}
