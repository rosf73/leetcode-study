class Solution {
public:
    int evalRPN(std::vector<std::string>& tokens) {
        std::stack<int> st; 

        for (const std::string& token : tokens) {

            if (token == "+" || token == "-" || token == "*" || token == "/") {
                int num1 = st.top(); st.pop();
                int num2 = st.top(); st.pop();
                
                if (token == "+") {
                    st.push(num2 + num1);
                }
                else if (token == "-") {
                    st.push(num2 - num1);
                }
                else if (token == "*") {
                    st.push(num2 * num1);
                }
                else { 
                    st.push(num2 / num1);
                }
            } else {
                st.push(std::stoi(token));
            }
        }

        return st.top();  
    }
};
