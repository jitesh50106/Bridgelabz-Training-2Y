public class LC424 {
    public static void main(String[] args) {
        String s = "ABCDEFGH";
        int k = 3;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
    }
}
