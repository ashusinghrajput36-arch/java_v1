package strings;
//most frequent character
public class q_1 {
    public char getmaxchar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char currchar = s.charAt(i);
            freq[currchar - 'a']++;
        }
        int maxfreq = -1;
        char ans = 'a';
        for (int i = 00; i < 26; i++) {
            if (freq[i] > maxfreq) {
                maxfreq = freq[i];
                ans = (char) (i + 'a');
            }
        }return ans;
    }
}
