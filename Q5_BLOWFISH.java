import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class Q5_BLOWFISH {
    public static void main(String[] args) throws Exception {

        String text = "Hello";
        String key = "MyKey123";

        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");

        // Encrypt
        Cipher c=Cipher.getInstance("Blowfish");
        c.init(Cipher.ENCRYPT_MODE,keySpec);
        byte [] enc=c.doFinal(text.getBytes());
        String encrypted=Base64.getEncoder().encodeToString(enc);

        // Decrypt
        c.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] dec = c.doFinal(enc);
        String decrypted = new String(dec);

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + new String(encrypted));
        System.out.println("Decrypted: " + new String(decrypted));
    }
}

