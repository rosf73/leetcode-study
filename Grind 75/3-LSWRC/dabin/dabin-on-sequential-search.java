import java.util.*;

class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        int[] charCompIndexList = new int[129];
        int startIndex = 0;
        int max = 0;
        int n = s.length();
        char op;
        int charCompIndex;

        for (int i = 0; i < n; ++i) {
            op = s.charAt(i);
            charCompIndex = charCompIndexList[op];
            
            if (charCompIndex != 0) {
                max = Math.max(max, i - startIndex);
                if (charCompIndex > startIndex) {
                    startIndex = charCompIndex;
                }
            }

            charCompIndexList[op] = i + 1;

            if(i == n - 1) {
                max = Math.max(max, i - startIndex + 1);
            }
        }

        return max;
    }
}
