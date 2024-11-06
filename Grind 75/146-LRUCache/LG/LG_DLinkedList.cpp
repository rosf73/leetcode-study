class LRUCache {
public:
    
    struct node{
        int key;
        int val;
        node* next;
        node* prev;
        node(int k, int v){
            key=k;
            val=v;
            prev=NULL;
            next=NULL;
        }
    };
    
    struct node *head = new node(-1,-1);
    struct node *tail = new node(-1,-1);
    
    int size;
    unordered_map<int,node*> mp; 
    
    LRUCache(int capacity) {
        size=capacity;
        head->next=tail;
        tail->prev=head;
    }
    
    void addNode(node *newnode){
        struct node *add_next = head->next;
        
        newnode->next = add_next;
        add_next->prev = newnode;
        
        head->next=newnode;
        newnode->prev=head;
    }
    
    void deleteNode(node *node){
        struct node *del_next = node->next;
        struct node *del_prev = node->prev;
        
        del_prev->next = del_next;
        del_next->prev = del_prev;
    }
    
    int get(int key) {
        if(mp.find(key)!=mp.end()){
            node *resnode=mp[key];
            int res=resnode->val;
            
            mp.erase(key); 
            deleteNode(resnode);
            addNode(resnode);
            
            mp[key]=head->next;
            return res;
        }
        return -1;
    }
    
    void put(int key, int value) {
        if(mp.find(key)!=mp.end()){
            node *existingnode = mp[key];
            mp.erase(key);
            deleteNode(existingnode);
        }
        
        if(mp.size()==size){
            node *dnode = tail->prev;
            mp.erase(dnode->key);
            deleteNode(dnode);
        }
        
        addNode(new node(key,value));
        mp[key]=head->next;
    }
};
