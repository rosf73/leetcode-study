import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n;
        int ransomNoteLength = ransomNote.length();
        int magazineLength = magazine.length();
        int remainAlphabetNum = ransomNote.length();
        int[] existAlphabetNum = new int[26];
        char op;
        boolean result = false;

        n = Math.max(ransomNoteLength, magazineLength);

        for (int i = 0; i < n; ++i) {
            if (i < ransomNoteLength) {
                op = ransomNote.charAt(i);
                ++existAlphabetNum[op - 'a'];

                if (existAlphabetNum[op - 'a'] <= 0) {
                    --remainAlphabetNum;
                }
            }

            if (i < magazineLength) {
                op = magazine.charAt(i);
                --existAlphabetNum[op - 'a'];

                if (existAlphabetNum[op - 'a'] >= 0) {
                    --remainAlphabetNum;
                }
            }

            if (remainAlphabetNum <= 0) {
                break;
            }
        }

        if (remainAlphabetNum <= 0) {
            result = true;
        }

        return result;
    }
}
