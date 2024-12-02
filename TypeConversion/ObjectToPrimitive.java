public class ObjectToPrimitive {

    public static void main(String[] args) {
        
        Integer obj1 = Integer.valueOf(5);
        Double obj2 = Double.valueOf(2.3);
        Boolean obj3 = Boolean.valueOf(false);


        int var1 = obj1.intValue();
        double var2 = obj2.doubleValue();
        boolean var3 = obj3.booleanValue();


        System.out.println("the value of int variable: " + var1);
        System.out.println("the value of double variable is: " + var2);
        System.out.println("the value of boolean variable is : " + var3);
    }
    
}
