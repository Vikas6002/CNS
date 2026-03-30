class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = shift % 26;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) (((int) ch + shift - 65) % 26 + 65);
                result.append(encryptedChar);
            } 
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) (((int) ch + shift - 97) % 26 + 97);
                result.append(encryptedChar);
            } 
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static String decrypt(String text, int shift) {
        int reverseShift = 26 - (shift % 26);
        return encrypt(text, reverseShift);
    }

    public static void main(String[] args) {
        String originalText = "ABCD";
        int shiftKey = 1; 
        System.out.println("Original Message : " + originalText);
        System.out.println("Shift Key        : " + shiftKey);
        System.out.println("-------------------------------------------------");
        String cipherText = encrypt(originalText, shiftKey);
        System.out.println("Encrypted Message: " + cipherText);
        String decryptedText = decrypt(cipherText, shiftKey);
        System.out.println("Decrypted Message: " + decryptedText);
    }
}