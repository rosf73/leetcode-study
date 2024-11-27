class TimeMap {
public:
    unordered_map<string, vector<pair<int, string>>> m;

    TimeMap() {
    }
    
    void set(string key, string value, int timestamp) {
        m[key].push_back({timestamp,value});
    }
    
    string get(string key, int timestamp) {
        if (m.find(key) == m.end()) {
            return "";
        }

        int left = 0;
        int right = m[key].size() - 1;

        while(left <= right) {
            int mid = (left+right)/2;

            if(m[key][mid].first < timestamp) {
                left = mid + 1;
            } else if(m[key][mid].first > timestamp) {
                right = mid - 1;
            } else {
                return m[key][mid].second;
            }
        }

        if(right >= 0) {
            return m[key][right].second;
        }

        return ""; 
        
    }
};
