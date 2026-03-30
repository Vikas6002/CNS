import java.util.*;

public class Diffie{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter modulo(p)");
        int p = sc.nextInt();
        System.out.println("Enter primitive root of "+p);
        int g = sc.nextInt();
        System.out.println("Enter first secret number (1st Person)");
        int a = sc.nextInt();
        System.out.println("Enter first secret number (2st Person)");
        int b = sc.nextInt();
        int A = ((int)Math.pow(g,a))%p;
        int B = ((int)Math.pow(g,b))%p;
        int S_A = ((int)Math.pow(B,a))%p;
        int S_B = ((int)Math.pow(A,b))%p;
        if(S_A==S_B){
            System.out.println("1st and 2nd person can communicate with each other");
            System.out.println("They share a secret number: "+S_A);
        } else {
            System.out.println("1st and 2nd person cannot communicate with each other");

        }

    }
}