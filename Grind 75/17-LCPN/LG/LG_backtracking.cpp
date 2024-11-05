class Solution {
private :
    void solve(string digits, string output, int i, string mapping[], vector<string>& ans){
        if (i >= digits.length())
        {
            ans.push_back(output) ;
            return ;
        }

        int number = digits[i]- '0' ;
        string value = mapping[number] ;

        for (int j=0; j<value.length(); j++)
        {
            output.push_back(value[j]) ;
            solve(digits, output, i+1, mapping, ans) ;
            output.pop_back() ;
        }
    }
public:
    vector<string> letterCombinations(string digits) {
        vector<string> ans ;
        if (digits.length() == 0) return ans ;
        string output ;
        string mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs" ,"tuv", "wxyz"} ;
        solve(digits, output, 0, mapping, ans) ;
        return ans ;
    }
};
