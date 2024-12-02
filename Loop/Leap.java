import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = reader.nextInt();


        boolean leap = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }else{
                    leap = false;
                }
            } else {
                leap = true;
            }
            
        } else {
            leap = false;
        }

        if (leap){
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }
        
    }
    
}
