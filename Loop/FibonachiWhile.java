public class FibonachiWhile {

    public static void main(String[] args) {
        
        int number = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        int i = 1;

        System.out.println("Fibonach Series till " + number + " Terms:");

        while (i <= number)
        {
            System.out.println(firstTerm + " ,");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
    }
    
}
