import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftHeight, rightHeight;
        int max = 0;

        while (left < right) {
            leftHeight = height[left];
            rightHeight = height[right];

            if (leftHeight <= rightHeight) {
                max = Math.max(leftHeight * (right - left), max);

                while (left < right && height[left] <= leftHeight) {
                    ++left;
                }
            } else {
                max = Math.max(rightHeight * (right - left), max);

                while (left < right && height[right] <= rightHeight) {
                    --right;
                }
            }
        }

        return max;
    }
}
