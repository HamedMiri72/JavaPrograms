import java.util.Scanner;

public class PrintInteger{
    public static void main(String[] arg){

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = reader.nextInt();

        System.out.println("You Enterd: " + number);
    }
}