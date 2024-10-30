class Solution {
    bool breaking(string &s, unordered_set<string>& cnt, int idx, vector<int> &dp){
        if(idx >= s.length()){
            return dp[idx] = true;
        }
        
        if(dp[idx] != -1) return dp[idx];
        if(cnt.find(s) != cnt.end()) return true;

        for(int i = 1; i <= s.length(); i++){
            string str = s.substr(idx, i);
            if((cnt.find(str) != cnt.end()) && (breaking(s, cnt, idx + i, dp))){
                return dp[idx] = true;
            }
        }
        return dp[idx] = false;
    }
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        unordered_set<string> cnt;
        for(auto it : wordDict){
            cnt.insert(it);
        }
        vector<int> dp(301, -1);
        return breaking(s, cnt, 0, dp);
    }
};
