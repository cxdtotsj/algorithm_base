# -*- coding: utf-8 -*-
# @Data : 2021-03-26

'''
BF算法 Python
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll" 输出: 2
 *
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba" 输出: -1

'''

class SolutionDef:

    def str_str(self, haystack, needle):
        haylen = len(haystack)
        needlen = len(needle)

        if haylen < needlen:
            return -1
        
        if needlen == 0:
            return 0
        
        for i in range(haylen - needlen + 1):
            j = 0
            for _ in range(needlen):
                if haystack[i+j] != needle[j]:
                    break
                j += 1
            
            if j == needlen:
                return i
            
        return -1

    def str_str_02(self, haystack, needle):
        i = 0
        j = 0
        haylen = len(haystack)
        needlen = len(needle)

        while i < haylen and j < needlen:
            h = haystack[i]
            n= needle[j]
            if h == n:
                j += 1
            else:
                i = i - j
                j = 0

            i += 1

        if j == needlen:
            renum = i = needlen
        else:
            renum = -1
        return renum
        


if __name__ == '__main__':
    sd = SolutionDef()
    index = sd.str_str_02('hellp', 'll')
    print(index)