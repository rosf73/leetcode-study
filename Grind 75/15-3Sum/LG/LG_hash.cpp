class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        for (int i = 0; i < nums.size(); i++) 
        {
            if (i > 0 && nums[i] == nums[i - 1])
             continue;  
        
            unordered_set<int> seen;

            for (int j = i + 1; j < nums.size(); j++) 
            {

                int cnt = -nums[i] - nums[j];
            
                if (seen.count(cnt))
                {

                    result.push_back({nums[i], cnt, nums[j]});

                    while (j + 1 < nums.size() && nums[j] == nums[j + 1])
                     j++;  
            
                }
                seen.insert(nums[j]);
            }
        }
        return result;
    }
};
