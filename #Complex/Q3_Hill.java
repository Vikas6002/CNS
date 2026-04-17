
import java.util.*;

public class Q3_Hill {

    static int[][] key = {
        {6, 24, 1},
        {13, 16, 10},
        {20, 17, 15}
    };

    static int mod = 26;

    // Modular inverse
    static int modInv(int a) {
        a = (a % mod + mod) % mod;
        for (int i = 1; i < mod; i++) {
            if ((a * i) % mod == 1) {
                return i;
            }
        }
        return -1;
    }

    // Inverse of 3x3 matrix
static int[][] inverseKey() {
        int[][] k = key;

        int det = k[0][0] * (k[1][1] * k[2][2] - k[1][2] * k[2][1])
                - k[0][1] * (k[1][0] * k[2][2] - k[1][2] * k[2][0])
                + k[0][2] * (k[1][0] * k[2][1] - k[1][1] * k[2][0]);

        det = (det % 26 + 26) % 26;
        int invDet = modInv(det);

        int[][] cof = new int[3][3];

        // Correct cofactors
        cof[0][0] = (k[1][1] * k[2][2] - k[1][2] * k[2][1]);
        cof[0][1] = -(k[1][0] * k[2][2] - k[1][2] * k[2][0]);
        cof[0][2] = (k[1][0] * k[2][1] - k[1][1] * k[2][0]);

        cof[1][0] = -(k[0][1] * k[2][2] - k[0][2] * k[2][1]);
        cof[1][1] = (k[0][0] * k[2][2] - k[0][2] * k[2][0]);
        cof[1][2] = -(k[0][0] * k[2][1] - k[0][1] * k[2][0]);

        cof[2][0] = (k[0][1] * k[1][2] - k[0][2] * k[1][1]);
        cof[2][1] = -(k[0][0] * k[1][2] - k[0][2] * k[1][0]);
        cof[2][2] = (k[0][0] * k[1][1] - k[0][1] * k[1][0]);

        int[][] adj = new int[3][3];

        // transpose + mod + multiply by inverse determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adj[i][j] = (cof[j][i] % 26 + 26) % 26;
                adj[i][j] = (adj[i][j] * invDet) % 26;
            }
        }

        return adj;
    }

    // Encrypt
    static String encrypt(String text,int key[][]) {
        text = text.toUpperCase().replaceAll(" ", "");

        while (text.length() % 3 != 0) {
            text += "X";
        }

        String res = "";

        for (int i = 0; i < text.length(); i += 3) {
            int[] p = new int[3];

            for (int j = 0; j < 3; j++) {
                p[j] = text.charAt(i + j) - 'A';
            }

            for (int r = 0; r < 3; r++) {
                int sum = 0;
                for (int c = 0; c < 3; c++) {
                    sum += key[r][c] * p[c];
                }

                res += (char) ((sum + 26 % 26) + 'A');
            }
        }
        return res;
    }

    // Decrypt
    static String decrypt(String text) {
        int[][] inv = inverseKey();
        return encrypt(text,inv);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int len=text.length();
        String enc = encrypt(text,key);
        System.out.println("Encrypted: " + enc);

        System.out.println("Decrypted: " + decrypt(enc).substring(0,len));
    }
}
