import java.util.Scanner;

public class Fibonacci {
    int a=0,b=1,c,temp;
    public static void fibo(int numb){
        Fibonacci fib = new Fibonacci();
        for(int i=0;i<=numb;i++){
            fib.c=fib.a+fib.b;
            System.out.print(fib.c+" ");
            fib.temp=fib.b;
            fib.a=fib.temp;
            fib.b=fib.c; 
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibon = new Fibonacci();
        System.out.print("Enter the number=");
        int numb=scanner.nextInt();
        System.out.print(fibon.a+" ");
        System.out.print(fibon.b+" ");
        fibo(numb);
    }
}
