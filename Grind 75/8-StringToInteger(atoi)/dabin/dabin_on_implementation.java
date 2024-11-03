import java.util.*;

class Solution {
    public int myAtoi(String s) {
        int result = 0;
        boolean isDigitStart = false;
        char op;
        int opNum;
        long tempSum;
        char sign = '+';

        for (int i = 0; i < s.length(); ++i) {
            op = s.charAt(i);

            if (isDigitStart) {
                if (op >= '0' && op <= '9') {
                    opNum = op - '0';
                    
                    if (sign == '+') {
                        tempSum = result * 10L + opNum;
                        if (tempSum > Integer.MAX_VALUE) {
                            result = Integer.MAX_VALUE;
                            return result;
                        }
                    } else {
                        tempSum = result * 10L - opNum;
                        if (tempSum < Integer.MIN_VALUE) {
                            result = Integer.MIN_VALUE;
                            return result;
                        }
                    }
                    
                    result = (int) tempSum;
                } else {
                    break;
                }
            } else {
                if (op == ' ') {
                    continue;
                } else if (op == '+' || op == '-') {
                    isDigitStart = true;
                    sign = op;
                } else if (op >= '0' && op <= '9') {
                    isDigitStart = true;
                    opNum = op - '0';
                    result = opNum;
                } else {
                    break;
                }
            }
        }

        return result;
    }
}
