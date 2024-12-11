
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class Aes {

    public static void main(String[] args){

        try {

            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();

            String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Encoded key is " + encodedKey);

            byte[] decodedKeyBytes = Base64.getDecoder().decode(encodedKey);
            System.out.println("Decoded aes key : ");
            for(byte b : decodedKeyBytes){
                System.out.print(decodedKeyBytes + "");
            }

            SecretKey decodeKey = new SecretKeySpec(decodedKeyBytes, "AES");
            System.out.println("AES secretKey" + decodeKey);

            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
}
