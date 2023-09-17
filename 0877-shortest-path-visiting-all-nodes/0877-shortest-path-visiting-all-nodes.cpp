class Solution {
public:
    int shortestPathLength(vector<vector<int>>& graph) {
        int n = graph.size();
        if(n == 1) return 0;
        int ans = 0;
        int allSetBits = (1 << n) - 1;
        queue<pair<int, int>> q;
        vector<vector<int>> vis(n, vector<int>(1 << n));
        for(int i = 0; i < n; i++){
            int mask = (1 << i);
            q.push({i, mask});
        }
        while(!q.empty()){
            ans++;
            int sz = q.size();
            while(sz--){
                int node = q.front().first;
                int currMask = q.front().second;
                q.pop();
                if(currMask == allSetBits) return ans - 1;
                for(auto newNode : graph[node]){
                    int newMask = currMask | (1 << newNode);
                    if(vis[newNode][newMask] == 0){
                        vis[newNode][newMask] = 1;
                        q.push({newNode, newMask});
                    }
                }
            }
        }
        return -1;
    }
};