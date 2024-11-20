class Solution {
public:
    int longestPalindrome(string s) {
        int k = s.size();
        unordered_map<char, int> umap;
        int evesum=0;
        int oddsum=0;
        for(int i=0; i<k; i++)
        { 
            umap[s[i]]++;
            if(umap[s[i]]%2 == 0)
             evesum += 2;
        }
        for(int i=0; i<k; i++)
        {
            if(umap[s[i]]%2 == 1)
            {
                oddsum++;
                break;
            }
        }
        return evesum + oddsum;

    }
};
