public class PowerNumber {

    public static void main(String[] args) {
        
        int number = 12;
        int exponent = 4;
        long result = 1;


        while(exponent != 0){
            result *= number;
            exponent--;
        }
        System.out.println(result);
    }
    
}
