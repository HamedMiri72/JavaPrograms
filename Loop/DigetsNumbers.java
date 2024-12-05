
import java.util.Scanner;

public class DigetsNumbers {

    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = reader.nextInt();

        int count = 0;

        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.println("Number of digets: " + count);
        
    }
    
}
