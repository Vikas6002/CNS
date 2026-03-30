public class SubstitutionCipher {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ALPHABET.indexOf(Character.toUpperCase(ch));
                char subChar = key.charAt(index);
                if (Character.isLowerCase(ch)) {
                    result.append(Character.toLowerCase(subChar));
                } else {
                    result.append(subChar);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                int index = key.indexOf(Character.toUpperCase(ch));
                char originalChar = ALPHABET.charAt(index);
                if (Character.isLowerCase(ch)) {
                    result.append(Character.toLowerCase(originalChar));
                } else {
                    result.append(originalChar);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String originalText = "Attack at dawn! The secret code is Java.";
        String cipherKey = "QWERTYUIOPASDFGHJKLZXCVBNM"; 

        System.out.println("Standard Alphabet: " + ALPHABET);
        System.out.println("Substitution Key : " + cipherKey);
        System.out.println("-------------------------------------------------");
        System.out.println("Original String  : " + originalText);
        String encryptedText = encrypt(originalText, cipherKey);
        System.out.println("Encrypted String : " + encryptedText);

        String decryptedText = decrypt(encryptedText, cipherKey);
        System.out.println("Decrypted String : " + decryptedText);
    }
}