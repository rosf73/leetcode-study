class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char,int> map;
        for(char it : magazine){
            map[it]++;
        }
        for(char c : ransomNote){
            if(map.find(c)!=map.end() && map[c]>0)
                map[c]--;
            else
                return false;
        }
        return true;
    }
};
