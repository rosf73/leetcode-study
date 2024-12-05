class Solution {
public:
    vector<vector<int>> ans;
    vector<int> cur;

    void rec(int k, vector<int>& c, int sum, int t) {
        if (sum == t) {
            ans.push_back(cur);
            return;
        }
        for (int i = k; i < c.size(); i++) {
            if (sum + c[i] > t) break; 
            cur.push_back(c[i]);
            rec(i, c, sum + c[i], t); 
            cur.pop_back();        
        }
    }

    vector<vector<int>> combinationSum(vector<int>& c, int t) {
        sort(c.begin(), c.end()); 
        rec(0, c, 0, t);        
        return ans;
    }
};
