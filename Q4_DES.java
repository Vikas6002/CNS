
import java.util.*;
import javax.crypto.*;
public class Q4_DES {
    public static void main(String[] args) throws Exception {

        String text="HEllo";

        KeyGenerator kg=KeyGenerator.getInstance("DES");
        SecretKey key=kg.generateKey();

        //Encrypt
        Cipher c=Cipher.getInstance("DES");
        c.init(Cipher.ENCRYPT_MODE,key);
        byte [] enc=c.doFinal(text.getBytes());
        String encrypted=Base64.getEncoder().encodeToString(enc);

        c.init(Cipher.DECRYPT_MODE, key);
        byte []dec=c.doFinal(enc);
        String decrypted=new String(dec);

        // Output
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
