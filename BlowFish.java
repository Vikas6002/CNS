
import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class BlowFish {

    public static void main(String[] args) throws Exception {

        String key = "MySecretKey123";
        String text = "Confidential Data";

        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");

        // Encrypt
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        String encrypted = Base64.getEncoder()
                .encodeToString(cipher.doFinal(text.getBytes()));

        // Decrypt
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        String decrypted = new String(cipher.doFinal(
                Base64.getDecoder().decode(encrypted)));

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
