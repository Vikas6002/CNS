
import javax.crypto.*;
import java.util.Base64;

public class Q5_Blowfish {

    public static void main(String[] args) throws Exception {

        String text = "Hello world";

        // Generate key directly
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");

        // Encrypt
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(text.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(enc);

        // Decrypt
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] dec = c.doFinal(enc);
        String decrypted = new String(dec);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
