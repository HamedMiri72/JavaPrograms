import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = reader.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " is a even number!");
        } else {
            System.out.println(number + " is a odd number!");
        }
    }
    
}
