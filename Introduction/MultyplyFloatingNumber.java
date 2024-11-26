
import java.util.Scanner;


public class MultyplyFloatingNumber {

    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter first floating number:");
        float first = reader.nextFloat();

        System.out.println("Enter second floating number: ");
        float second = reader.nextFloat();

        float multyply = first * second;

        System.out.println("the product is : " + multyply);
        
    }
}
