import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int current;
        int comp;
        int max = 0;
        boolean[] maxExist = new boolean[n];

        for (int i = 0; i < n - 1; ++i) {
            current = height[i];

            if (current == 0) {
                continue;
            }

            for (int j = n - 1; j > i; --j) {
                if (maxExist[j]) {
                    continue;
                }

                comp = height[j];

                if (comp >= current) {
                    max = Math.max(max, current * (j - i));
                    break;
                } else {
                    max = Math.max(max, comp * (j - i));
                    maxExist[j] = true;
                }
            }
        }

        return max;
    }
}
