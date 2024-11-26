

public class Swap {
    public static void main(String[] args){

        float first = 1.20f;
        float second = 2.45f;

        System.out.println("--before swap--");
        System.out.println("first number: " + first);
        System.out.println("second number :" + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

    }
}
