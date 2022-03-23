import java.util.Scanner;

public class Vowels {

    public static void VowOrConstants(char character){
        if((character == 'a') || (character == 'e') || (character == 'i') || (character == 'o') || (character == 'A') || 
        (character == 'E') || (character == 'I') || (character == 'O') || (character == 'U')){
            System.out.println(character+" is a Vowel.");
        }else{
            System.out.println(character+" is a Consonant.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character=");
        char character= scanner.next().charAt(0);

        VowOrConstants(character);
    }
}
