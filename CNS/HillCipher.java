public class HillCipher {
    private static final int[][] KEY_MATRIX = {
            {3, 3},
            {2, 5}
    };
    public static String encrypt(String text) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "");  
        if (text.length() % 2 != 0) {
            text += "X";
        }
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) {
            int p1 = text.charAt(i) - 'A';
            int p2 = text.charAt(i + 1) - 'A';

            int c1 = (KEY_MATRIX[0][0] * p1 + KEY_MATRIX[0][1] * p2) % 26;
            int c2 = (KEY_MATRIX[1][0] * p1 + KEY_MATRIX[1][1] * p2) % 26;

            cipherText.append((char) (c1 + 'A'));
            cipherText.append((char) (c2 + 'A'));
        }
        return cipherText.toString();
    }
    public static String decrypt(String text) {
        StringBuilder plainText = new StringBuilder();
        int det = (KEY_MATRIX[0][0] * KEY_MATRIX[1][1] - KEY_MATRIX[0][1] * KEY_MATRIX[1][0]) % 26;
        if (det < 0) {
            det = (det % 26) + 26;
            det %= 26;
        }
        int detInverse = -1;
        for (int i = 0; i < 26; i++) {
            if ((det * i) % 26 == 1) {
                detInverse = i;
                break;
            }
        }
        if (detInverse == -1) {
            throw new RuntimeException("Invalid Key Matrix: No modular inverse exists.");
        }
        int[][] inverseMatrix = new int[2][2];
        inverseMatrix[0][0] = (KEY_MATRIX[1][1] * detInverse) % 26;
        inverseMatrix[0][1] = (-KEY_MATRIX[0][1] * detInverse) % 26;
        inverseMatrix[1][0] = (-KEY_MATRIX[1][0] * detInverse) % 26;
        inverseMatrix[1][1] = (KEY_MATRIX[0][0] * detInverse) % 26;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (inverseMatrix[i][j] < 0) {
                    inverseMatrix[i][j] = (inverseMatrix[i][j] % 26) + 26;
                    inverseMatrix[i][j] %= 26;
                }
            }
        }
        for (int i = 0; i < text.length(); i += 2) {
            int c1 = text.charAt(i) - 'A';
            int c2 = text.charAt(i + 1) - 'A';

            int p1 = (inverseMatrix[0][0] * c1 + inverseMatrix[0][1] * c2) % 26;
            int p2 = (inverseMatrix[1][0] * c1 + inverseMatrix[1][1] * c2) % 26;

            plainText.append((char) (p1 + 'A'));
            plainText.append((char) (p2 + 'A'));
        }
        return plainText.toString();
    }

    public static void main(String[] args) {
        String message = "HELLOWORLD";
        System.out.println("Original Message: " + message);

        String encrypted = encrypt(message);
        System.out.println("Encrypted (Hill): " + encrypted);

        String decrypted = decrypt(encrypted);
        String cleanDecrypted = decrypted.replaceAll("X+$", "");
        System.out.println("Decrypted       : " + cleanDecrypted);
    }
}