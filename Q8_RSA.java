
import java.math.*;
import java.util.*;

public class Q8_RSA {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p and q: ");
        BigInteger p = sc.nextBigInteger();
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        BigInteger e = BigInteger.valueOf(3); // simple choice
        while (!phi.gcd(e).equals(BigInteger.ONE)) {
            e = e.add(BigInteger.TWO);
        }

        BigInteger d = e.modInverse(phi);

        System.out.print("Enter message (< n): ");
        BigInteger m = sc.nextBigInteger();

        BigInteger c = m.modPow(e, n);      // Encrypt
        BigInteger dec = c.modPow(d, n);    // Decrypt

        System.out.println("Encrypted: " + c);
        System.out.println("Decrypted: " + dec);
    }
}
