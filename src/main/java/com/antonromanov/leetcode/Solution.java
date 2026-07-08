package com.antonromanov.leetcode;

public class Solution {
    public int strStr(String haystack, String needle) {
      
        int haystackLength = haystack.length();
        int res = -1;
        int needleLength = needle.length(); // Получаем длину
        int compareCounter = needleLength;
        int needleCounter = 0;
        
        for (int i = 0; i <= haystackLength-1; i++) {
         
         boolean flag = true;
        
         
         System.out.println("Compare " + haystack.charAt(i) + " && " + needle.charAt(needleCounter) + "[]");
         
         if (haystack.charAt(i) == needle.charAt(needleCounter)) {
            if (res == -1) {
            res = i;
        }

            System.out.println("" + haystack.charAt(i) + " && " + needle.charAt(needleCounter) + " are equals");
            compareCounter = compareCounter - 1;
            if (needleCounter == needleLength - 1) {
                needleCounter = 0;
            } else {
                needleCounter = needleCounter +1;
            }
            
          } else {
            flag = false;
            res = -1;
            needleCounter = 0;
            if (compareCounter != 0) {
                compareCounter = needleLength;
            }
          }

          if (compareCounter == 0) {
            break;
          }
        }

        return res;
    }
}
