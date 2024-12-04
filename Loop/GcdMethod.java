
import java.math.BigInteger;

public class GcdMethod {
    public static void main(String[] args){
        int number1 = 48;
        int number2 = 18;

        int gcd = BigInteger.valueOf(number1).gcd(BigInteger.valueOf(number2)).intValue();
        System.out.println("the gcd is: " + gcd);
    }
    
}
