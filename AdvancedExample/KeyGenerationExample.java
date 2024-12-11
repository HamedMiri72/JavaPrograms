
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/*
 * Key generation (HMAC using SHA-256) for security.
 *Base64 encoding to convert the binary key into a text format for storage or transmission.
 *Base64 decoding to retrieve the original byte array from the Base64 string.
 *SecretKeySpec to recreate the SecretKey from the byte array and prepare it for use in cryptographic operations.
 */
public class KeyGenerationExample {
    public static void main(String[] args) {
        try {
            
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
            keyGenerator.init(256);
            SecretKey secretKey = keyGenerator.generateKey();

            String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Base64 Encoded Secret key :" + encodedKey);

            byte[] decodedKeyBytes = Base64.getDecoder().decode(encodedKey);
            System.out.println("Decoded key (byte array) : " + decodedKeyBytes);

            for (byte b: decodedKeyBytes){
                System.out.print(b + "");
            }

            SecretKey decodedKey = new SecretKeySpec(decodedKeyBytes, "HmacSHA256");
            System.out.println("SecretKey from decoded bytes: " + decodedKey);
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

        }
    }
}
