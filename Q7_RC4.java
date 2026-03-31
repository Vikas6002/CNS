
import java.util.*;

public class Q7_RC4 {

    public static void main(String[] args) {
        String key = "key", text = "HELLO";
        byte[] d = rc4(text.getBytes(), key.getBytes());
        System.out.println("Enc: " + Arrays.toString(d));
        System.out.println("Dec: " + new String(rc4(d, key.getBytes())));
    }

    static byte[] rc4(byte[] d, byte[] k) {
        int[] S = new int[256];
        int j = 0;
        for (int i = 0; i < 256; i++) {
            S[i] = i;
        }
        for (int i = 0; i < 256; i++) {
            j = (j + S[i] + k[i % k.length]) % 256;
            int t = S[i];
            S[i] = S[j];
            S[j] = t;
        }
        int i = 0;
        j = 0;
        byte[] r = new byte[d.length];
        for (int n = 0; n < d.length; n++) {
            i = (i + 1) % 256;
            j = (j + S[i]) % 256;
            int t = S[i];
            S[i] = S[j];
            S[j] = t;
            r[n] = (byte) (d[n] ^ S[(S[i] + S[j]) % 256]);
        }
        return r;
    }
}
