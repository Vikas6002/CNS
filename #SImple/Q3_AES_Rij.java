
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.*;


public class Q3_AES_Rij {
    public static void main(String[] args) throws Exception{
        String text="HELLO";
        KeyGenerator kg=KeyGenerator.getInstance("AES");
        SecretKey key=kg.generateKey();

        Cipher c=Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE,key);
        byte []enc=c.doFinal(text.getBytes());
        String e=Base64.getEncoder().encodeToString(enc);

        c.init(Cipher.DECRYPT_MODE,key);
        byte []dec=c.doFinal(enc);
        String d=new String(dec);


        System.out.println("Encrypted : " + e + "\n Decrepted : " + d);
    }
}
