//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

/**
 * 1.用一个计数器表计算s 字母的频率，用t 减少计数器表中的每个字母的计数器，然后检查计数器是否回到零。
 */
public class LeetCode_242_0248 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}