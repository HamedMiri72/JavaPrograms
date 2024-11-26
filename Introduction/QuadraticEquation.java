

public class QuadraticEquation {

    public static void main(String[] args){
        double a = 2.3;
        double b = 4;
        double c = 5.6;

        double discriminate = b * b - 4 * a * c;

        if (discriminate > 0) {
            double root_1 = (-b + Math.sqrt(discriminate)) / (2 * a);
            double root_2 = (-b - Math.sqrt(discriminate)) / (2 *a) ;
            System.out.println("root 1 = " + root_1 +  "root 2 = " + root_2 );
        } else if (discriminate == 0) {
            double root = -b / (2 * a); 
            System.out.println("root_1 = root_2" + root);
            
        }else {
            double real = -b / (2* a) ;
            double imaginary = Math.sqrt(-discriminate) / (2 * a);
            System.out.println("root 1 = " + real + "+" + imaginary);
            System.out.println("root_2" + real + "+" + imaginary);

        }


    }
    
}
