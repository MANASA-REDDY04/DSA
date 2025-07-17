/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int i = 0; i < n; i++){
            if(lists[i] != null){
                temp.next = lists[i];
            }
            while(temp.next != null){
                pq.offer(temp.next);
                temp = temp.next;
            }
        }
        temp = dummy;
        while(!pq.isEmpty()){
            temp.next = pq.poll();
            temp = temp.next;
        }
        temp.next = null;
        return dummy.next;
    }
}