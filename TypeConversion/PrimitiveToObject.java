public class PrimitiveToObject {

    public static void main(String[] args) {
        int var1 = 5;
    double var2 = 5.65;
    boolean var3 = true;

    //convert into wrapper object

    Integer obj1 = Integer.valueOf(var1);
    Double obj2 = Double.valueOf(var2);
    Boolean obj3 = Boolean.valueOf(var3);

    if (obj1 instanceof Integer){
        System.out.println("An object of integer is created!");
    }

    if (obj2 instanceof Double){
        System.out.println("an object of Double is created!");
    }

    if (obj3 instanceof Boolean){
        System.out.println("an object of Boolean is created");
    }

    }
}
