
import java.util.Base64;
import javax.crypto.*;


public class Q4_BlowFish {
    public static void main(String[] args) throws Exception{
        String mes ="Hello World";
        KeyGenerator kg=KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c=Cipher.getInstance("Blowfish");
        c.init(c.ENCRYPT_MODE, key);
        byte [] en = c.doFinal(mes.getBytes());
        String e=Base64.getEncoder().encodeToString(en);


        c.init(c.DECRYPT_MODE, key);
        byte[] dn = c.doFinal(e.getBytes());
        String d = new String(dn);

        System.out.println("Encrypted : " + e + "\n Decrepted : " + d);
    }
}
