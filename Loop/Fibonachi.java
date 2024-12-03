public class Fibonachi {

    public static void main(String[] args){
        int number = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonach Series till " + number + " Terms: ");

        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm + ",");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
    
}
