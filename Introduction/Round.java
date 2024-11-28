import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Round {

    public static void main(String[] args){
        double num = 1.3464647;
        System.out.format("%.2f", num);

        double number = 4.3834382;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(number));
    }
    
}
