
import java.util.Scanner;



public class CaracterFrequency {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = reader.nextLine();
        System.out.println("Enter a character: ");
        char ch = reader.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++){
            if( ch == str.charAt(i)){

                frequency++;

            }

        }
        System.out.println("frequency of word is :" + frequency);
    }
    
}
