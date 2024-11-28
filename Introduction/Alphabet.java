

public class Alphabet {
    
    public static void main(String[] args){

        char ch = 't';
        //char basicllay store the ascii value of the ch in the variable
        if( ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println(ch +"is an alphabet");
        } else {
            System.out.println("it is not an alphabt");
        }
    }
}
