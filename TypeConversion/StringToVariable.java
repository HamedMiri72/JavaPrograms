public class StringToVariable {
    public static void main(String[] args) {
        
        String str1 = "true";
        String str2 = "false";

        boolean value1 = Boolean.parseBoolean(str1);
        boolean value2 = Boolean.parseBoolean(str2);

        System.out.println(value1);
        System.out.println(value2);
    }
    
}
