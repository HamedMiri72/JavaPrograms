import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SimpleJWTExample {

    public static void main(String[] args) {
        // 1. Secret key (Base64 encoded)
        String secretString = "Wmc1JGtGM1htNyFiVHE4QExwWXZOOX5ySjJXNEMjb0t6NkQmZlI3XngNQHBMa1l2IU0yVzUjb1Q4JHpKM0NuOUQ=";

        // 2. Decode the Base64-encoded secret key string
        byte[] keyBytes = Base64.getDecoder().decode(secretString.getBytes(StandardCharsets.UTF_8));

        // 3. Create a SecretKey using the decoded bytes with HMAC SHA-256 algorithm
        SecretKey key = new SecretKeySpec(keyBytes, "HmacSHA256");

        //String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
        //System.out.println("Base64 Encoded Key: " + encodedKey);

        // 4. Print the SecretKey to verify it's been created correctly
        System.out.println("Secret Key: " + new String(key.getEncoded(), StandardCharsets.UTF_8));

        // Example use case: Generate JWT token
        String jwtToken = generateJWT("john_doe", key);
        System.out.println("Generated JWT Token: " + jwtToken);
    }

    // Method to generate a simple JWT token (for demonstration purposes)
    public static String generateJWT(String username, SecretKey key) {
        // Using the username as the subject and signing with the secret key
        return "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ" + username + "ImlhdCI6MTY3Njk1NjAwMywiZXhwIjoxNjc3MjkzNjAzfQ.xUDdTeByyVz9nRP7xSFSgWv63eox6I49mjYipX_GGbM";
    }
}
