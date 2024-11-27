
import java.util.Scanner;



public class PositiveNegative {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = reader.nextInt();

        if (number > 0 ) {
            System.out.println("it is a positive number!");
        } else if (number < 0) {
            System.out.println("it is a negative number!");
        } else {
            System.out.println(number + "is a 0");
        }

    }
    
}
