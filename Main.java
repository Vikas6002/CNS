import java.security.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String msg = "Banking Transaction Data";
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hash = md.digest(msg.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("SHA-1: " + sb);
    }
}
