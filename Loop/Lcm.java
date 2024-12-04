

public class Lcm {

    public static void main(String[] args) {
        
        int number1 = 48;
        int number2 = 18;

        System.out.println("LCM: " + lcm(number1, number2));
    }

    public static int gcd(int number1, int number2) {
        while(number2 != 0){
            int temp = number2;
            number2 = number1 / number2;
            number1 = temp;
        }
        return number1;
        
    }

    public static int lcm(int number1, int number2){
        return Math.abs(number1 * number2) / gcd(number1, number2);
    }


}
