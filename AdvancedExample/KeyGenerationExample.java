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
            // Step 1: Generate a Secret Key using KeyGenerator
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256"); // Create KeyGenerator instance for HMAC SHA256
            keyGenerator.init(256);  // HMAC SHA256 key size (in bits) - 256 bits
            SecretKey secretKey = keyGenerator.generateKey();  // Generate the secret key
            
            // Step 2: Encode the Secret Key to a Base64 String
            String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded()); // Base64 encode the key
            System.out.println("Base64 Encoded Secret Key: " + encodedKey); // Print the encoded key

            // Step 3: Decode the Base64 String back to byte array
            byte[] decodedKeyBytes = Base64.getDecoder().decode(encodedKey); // Decode the Base64 string back to byte array
            System.out.println("Decoded Secret Key (byte array): ");
            for (byte b : decodedKeyBytes) {  // Print the decoded byte array (in decimal values)
                System.out.print(b + " "); 
            }

            // Step 4: Verify by recreating the SecretKey from the byte array
            SecretKey decodedKey = new SecretKeySpec(decodedKeyBytes, "HmacSHA256"); // Recreate SecretKey using the decoded byte array
            System.out.println("\nReconstructed SecretKey from decoded bytes: " + decodedKey); // Print the reconstructed key
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); // Print the exception stack trace if it occurs
        }
    }
}
