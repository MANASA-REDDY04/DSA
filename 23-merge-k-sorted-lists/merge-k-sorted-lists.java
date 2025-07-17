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
            if(lists[i] != null) pq.offer(lists[i]);
        }
        temp = dummy;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;
            if(node.next != null) pq.offer(node.next);
        }
        temp.next = null;
        return dummy.next;
    }
}