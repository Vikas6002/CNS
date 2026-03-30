import javax.crypto.*;
import java.util.*;

public class DESCipher {
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        return keyGenerator.generateKey();
    }
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] b = cipher.doFinal(Base64.getDecoder().decode(encryptedText.getBytes()));
        return new String(b);
    }

    public static void main(String[] args) {
        try {
            String originalText = "Top Secret Java Message!";
            SecretKey myDesKey = generateKey();
            System.out.println("Original Text : " + originalText);
            System.out.println("-------------------------------------------------");
            String encryptedText = encrypt(originalText, myDesKey);
            System.out.println("Encrypted Text: " + encryptedText);
            String decryptedText = decrypt(encryptedText, myDesKey);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}