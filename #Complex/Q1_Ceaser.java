import java.util.Scanner;
public class Q1_Ceaser {
    public static String encrypt(String s,int shift)
    {
        String res="";
        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                char base =Character.isUpperCase(c) ? 'A' : 'a';
                res+=(char)((c-base + shift)%26 + base);
            }
            else res+=c;
        }
        return res;
    }
    public static String decrypt(String s,int shift)
    {
        return encrypt(s,26-shift);
    }
    public static void main(String[] args) {
        String mes="Hello World";
        int shift =29;
        String en=encrypt(mes,shift);
        String de= decrypt(en, shift);
        System.out.println("En : "+en+"\nDe : "+de);
    }
}
