import java.util.*;

class Solution {
    int[][] memo;
    int maxLength = 1;
    int startIndex = 0;
    int endIndex = 0;

    public String longestPalindrome(String s) {
        char op;
        memo = new int[s.length()][s.length()];
        
        find(s, 0, s.length() - 1);
        return s.substring(startIndex, endIndex + 1);
    }

    int find(String s, int start, int end) {
        if (memo[start][end] >= 1 || memo[start][end] == -1) {
            return memo[start][end];
        }

        if (start == end) {
            memo[start][end] = 1;
            return memo[start][end];
        }

        if (start > end) {
            return 0;
        }

        char op1 = s.charAt(start);
        char op2 = s.charAt(end);
        
        find(s, start + 1, end);
        find(s, start, end - 1);

        if (op1 == op2) {
            int result = find(s, start + 1, end - 1);

            if (result >= 0) {
                memo[start][end] = result + 2;
                compareMax(start, end);

                return memo[start][end];
            } else {
                memo[start][end] = -1;

                return memo[start][end];
            }
        } else {
            memo[start][end] = -1;

            return memo[start][end];
        }
    }

    void compareMax(int start, int end) {
        if (memo[start][end] > maxLength) {
            maxLength = memo[start][end];
            startIndex = start;
            endIndex = end;
        }
    }
}
