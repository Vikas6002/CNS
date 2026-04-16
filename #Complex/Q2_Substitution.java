
public class Q2_Substitution {
    static String al="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    public static void main(String[] args) {
        String mes="Hello World";
        String key="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM ";
        String en = encrypt(mes,key);
        String de = decrypt(en, key);
        System.out.println("En : " + en + "\nDe : " + de);
    }
    public static String encrypt(String s,String key)
    {
        String res="";
        for(char c : s.toCharArray())
        {
            int index=al.indexOf(c);
            res+=key.charAt(index);
        }
        return res;
    }
    public static String decrypt(String s, String key) {
        String res = "";
        for (char c : s.toCharArray()) {
            int index = key.indexOf(c);
            res += al.charAt(index);
        }
        return res;
    }
}
