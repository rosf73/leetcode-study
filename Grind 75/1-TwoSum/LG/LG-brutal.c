﻿int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* ans = (int*)malloc(sizeof(int) * 2);
    *returnSize = 2;
    int i, j;
    for (int i = 0;i < numsSize - 1;i++)
    {
        for (j = i + 1;j < numsSize;j++)
        {
            if (nums[i] + nums[j] == target)
            {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}