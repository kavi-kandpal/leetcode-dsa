class Solution {
public:
    int maxDepth(string s) {
        stack<char> st;
        int count=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='('){
                st.push('(');
                m = st.size(); 
                count = max(count, m);
            }
            else if(s[i]==')'){
                st.pop();
            }
        }
        return count;
    }
};