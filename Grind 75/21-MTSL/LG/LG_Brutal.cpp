class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (list1 == nullptr) 
        {
            return list2;
        }
        if (list2 == nullptr) 
        {
            return list1;
        }
      ListNode* result=nullptr;
      if(list1->val < list2-> val)
      {
        result=list1;
        result->next=mergeTwoLists(list1->next ,list2);
      }   
      else
      {
        result=list2;
        result->next=mergeTwoLists(list1,list2->next);
      }
      return result;
    }
};
