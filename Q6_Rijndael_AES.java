
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class Q6_Rijndael_AES {

    public static void main(String[] args) throws Exception {

        String text = "Hello";
        String key = "1234567890123456"; // 16 bytes

        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
        Cipher c = Cipher.getInstance("AES");

        // Encrypt
        c.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] enc = c.doFinal(text.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(enc);

        // Decrypt
        c.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] dec = c.doFinal(enc);
        String decrypted = new String(dec);

        // Output
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
