/**
 * @ClassName: LeetCode389
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/28 20:37
 * @URL：https://github.com/GaoHaiNB
 */
public class LeetCode389 {
    public char findTheDifference(String s, String t) {
        int sizeS = s.length();
        int sizeT = t.length();
        if (sizeS == 0) {
            return t.charAt(0);
        }
        int[] table = new int[26];
        for (int i = 0; i < sizeT; i++) {
            if (i < sizeS) {
                table[s.charAt(i) - 'a']++;
            }
            table[t.charAt(i)]--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0) {
                return (char) ('a' + i);
            }
        }
        return 'a';
    }
}