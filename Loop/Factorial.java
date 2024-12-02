
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = reader.nextInt();
        int Factorial = 1;

        for (int i = 1; i < number; i++){
            Factorial *= i;

        }
        System.out.println("the factorial is = " + Factorial);
    }
    
}
