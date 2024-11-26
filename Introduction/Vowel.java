import java.util.Scanner;

public class Vowel {

    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = reader.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("the character you provided is a vowel sound!");
        }else {
        System.out.println("is not a vowel sound!!");
        }
    
    }
    
    
}
