
import javax.crypto.*;
import java.util.*;

public class Q2_DES {

        public static void main(String[] args) throws Exception{
            String text="HELLO";
            KeyGenerator kg=KeyGenerator.getInstance("DES");
            SecretKey key=kg.generateKey();
    
            Cipher c=Cipher.getInstance("DES");
            c.init(Cipher.ENCRYPT_MODE,key);
            byte []enc=c.doFinal(text.getBytes());
            String e=Base64.getEncoder().encodeToString(enc);
    
            c.init(Cipher.DECRYPT_MODE,key);
            byte []dec=c.doFinal(enc);
            String d=new String(dec);
    
    
            System.out.println("Encrypted : " + e + "\n Decrepted : " + d);
        }
    }
    

