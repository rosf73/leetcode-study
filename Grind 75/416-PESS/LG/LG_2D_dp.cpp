class Solution {
public:
    
    bool canPartition(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else
        sum/=2;
        vector<vector<int>>dp(n+1,vector<int>(sum+1,0));
        for(int j=0;j<sum+1;j++){
            dp[0][j]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                //skip 
                if(nums[i-1]>j){
                    //non take
                    dp[i][j]=dp[i-1][j];
                }
                //take
                else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];     
                }
            }
        }
        return dp[n][sum];
    }
};
