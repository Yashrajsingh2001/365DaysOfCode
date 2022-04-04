// Que link: https://leetcode.com/problems/merge-in-between-linked-lists/
// 1669. Merge In Between Linked Lists


// Method 1:
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode L1 = list1;
        int cnt=1;
        for(; cnt<a && list1.next != null; cnt++){
            list1 = list1.next;
        }
        ListNode S = list1;
        for(; cnt<=b && list1.next != null; cnt++){
            list1 = list1.next;
        }
        S.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = list1.next;
        return L1;
    }
}


// Method 2:
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode L1 = list1;
        int cnt=1;
        ListNode S = list1; // take any value because it will be changed in if condition
        for(; cnt<=b && list1.next != null; cnt++){
            if(cnt == a) S = list1;
            list1 = list1.next;
        }
        S.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = list1.next;
        return L1;
    }
}