import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a statment!");
        String str = reader.nextLine();

        System.out.println("Original line: " + str);
        str = str.replaceAll("\\s", ""); // \\s finds all white space characters 
        System.out.println("After replacing: " + str);
    }
    
}
