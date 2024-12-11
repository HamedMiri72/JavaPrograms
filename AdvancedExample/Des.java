
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Des {

    public static void main(String[] args) {
        
        try {
            
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            keyGenerator.init(56);
            SecretKey secretKey = keyGenerator.generateKey();

            String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Encoded secret key is: " + encodedKey);

            byte[] decodedKeyByte = Base64.getDecoder().decode(encodedKey);
            System.out.println("Decoded secret key: ");
            for (byte b: decodedKeyByte){
                System.out.println(b + "");
            }

            SecretKey decodedKey = new SecretKeySpec(decodedKeyByte, "DES");
            System.out.print("Decoded secret key : " + decodedKey);


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
}
