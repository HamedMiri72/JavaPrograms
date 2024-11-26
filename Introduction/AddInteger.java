
import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);

     System.out.println("Enter first number: ");
     int first = reader.nextInt();

     System.out.println("Enter second number: ");
     int second = reader.nextInt();

     int sum = first + second;
     System.out.println("Sum is: " + sum);
        
    }
    
}
