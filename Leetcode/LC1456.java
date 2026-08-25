public class LC1456{
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        int maxVowels = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            if (isVowel(s.charAt(i))) {
                count++;
            }
            maxVowels = Math.max(maxVowels, count);
        }
        System.out.println(maxVowels);
    }
}