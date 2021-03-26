package structure_algorithm;

/**
 * @author: bear
 * @create: 2021-03-26 11:24:29
 * @desc: BF算法
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll" 输出: 2
 *
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba" 输出: -1
 */

class SolutionDef {

    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        // 待查找的字符串比给定字符串大
        if (haylen < needlen) {
            return -1;
        }
        // 待查找字符串为 ''
        if (needlen == 0) {
            return 0;
        }
        for (int i=0; i < haylen - needlen + 1; i++) {
            int j;
            // 给定字符串
            for (j=0; j < needlen; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needlen) {
                return i;
            }
        }
        return -1;
    }

    public int strStr02(String haystack, String needle) {
        int i, j;
        int haylen = haystack.length();
        int needlen = needle.length();

        for (i=0, j=0; i < haylen && j < needlen; i ++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                ++j;
            }
            else {
                i -= j;
                j = 0;
            }
        }

        int renum = j == needlen ? i - needlen : -1;
        return renum;
    }
}


public class Solution {
    public static void main(String[] args) {
        SolutionDef sd = new SolutionDef();
        int index = sd.strStr02("hello", "ll");
        System.out.println(index);
    }
}
