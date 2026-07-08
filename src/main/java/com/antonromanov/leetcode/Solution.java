package com.antonromanov.leetcode;

public class Solution {
    public int strStr(String haystack, String needle) {
    
        int hLen = haystack.length();
        int nLen = needle.length();
        
        // Если needle пустая, возвращаем 0 (по условию задачи)
        if (nLen == 0) {
            return 0;
        }
        
        // Внешний указатель i - позиция в haystack
        // Идём только до hLen - nLen, потому что дальше needle не поместится
        for (int i = 0; i <= hLen - nLen; i++) {
            // Внутренний указатель j - позиция в needle
            int j = 0;
            
            // Сравниваем символы, пока они совпадают
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // Если прошли все символы needle - нашли совпадение
            if (j == nLen) {
                return i;
            }
        }
        
        return -1;
    }
}
    
