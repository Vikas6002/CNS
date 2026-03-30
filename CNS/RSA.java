import java.util.*;
import java.math.*;
public class RSA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number (p)");
        BigInteger p = sc.nextBigInteger();
        System.out.println("Enter a prime number (q)");
        BigInteger q = sc.nextBigInteger();
        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = generate(phi);
        BigInteger d = e.modInverse(phi);
        System.out.println("Public Key (n,e)"+n+"--"+e);
        System.out.println("Private Key (n,d)"+n+"--"+d);
    }
    public static BigInteger generate(BigInteger phi){
        BigInteger e;
        Random r = new Random();
        do{
            e= new BigInteger(phi.bitLength(),r);
        }while(e.compareTo(BigInteger.valueOf(2))<=0||e.compareTo(phi)>=0||!e.gcd(phi).equals(BigInteger.ONE));
        return e;
    }
}
