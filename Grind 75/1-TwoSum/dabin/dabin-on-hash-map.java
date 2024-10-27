import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int op;
        int result[] = new int[2]; 

        for (int i = 0; i < nums.length; ++i) {
            op = nums[i];

            if (map.containsKey(op) && map.get(op) != i) {
                result[0] = map.get(op);
                result[1] = i;
                break;
            }

            map.put(target - op, i);
        }

        return result;
    }
}

