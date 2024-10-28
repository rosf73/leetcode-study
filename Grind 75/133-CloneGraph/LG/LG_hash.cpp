class Solution {
public:
    
    unordered_map<Node*, Node*> map;
    
    Node* cloneGraph(Node* node) {
        
        if(node == NULL)
            return NULL;
        
        if(map.find(node) != map.end())
            return map[node];
        
      
        Node* new_node = new Node(node -> val);
        
        map[node] = new_node;
        
        for(Node* &it : node -> neighbors)
        {
            Node* near = cloneGraph(it);
            
            new_node -> neighbors.push_back(near);
        }
        
        return new_node;
    }
};
