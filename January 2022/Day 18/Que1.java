// Que link: https://leetcode.com/problems/linked-list-random-node/

// Method 1: easy to understand
class Solution {
    ArrayList<Integer> al=new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
    }
    
    public int getRandom() {
        int z=(int)(Math.random()*al.size());
        return al.get(z);  
    }
}



// Method 2:
class Solution {
    ListNode head;
    Random random;
    public Solution(ListNode h) {
        head = h;       
        random = new Random();        
    }

    public int getRandom() {
        ListNode c = head;
        int r = c.val;
        for(int i=1;c.next != null;i++){
            c = c.next;
            if(random.nextInt(i + 1) == i) r = c.val;                        
        }
        return r;
    }
}